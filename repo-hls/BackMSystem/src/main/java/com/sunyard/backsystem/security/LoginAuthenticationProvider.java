package com.sunyard.backsystem.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.authentication.encoding.PlaintextPasswordEncoder;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * @Package: com.sunyard.backsystem.security
 * @Author: helishi
 * @CreateDate: 2017/11/4
 * @Description:
 */
//@Component
public class LoginAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
    private PasswordEncoder passwordEncoder = new PlaintextPasswordEncoder();

    private SaltSource saltSource;
    @Autowired
    private LoginUserDetailsService userDetailsService;

    protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                  UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {

        Object salt = null;
        if (this.saltSource != null) {
            salt = this.saltSource.getSalt(userDetails);
        }
        if (authentication.getCredentials() == null) {
            logger.debug("Authentication failed: 密码为空");
            throw new BadCredentialsException("密码错误:" + userDetails);
        }
        String presentedPassword = authentication.getCredentials().toString();
        if (!passwordEncoder.isPasswordValid(userDetails.getPassword(), presentedPassword, salt)) {
            logger.debug("Authentication failed: 密码不匹配");
            throw new BadCredentialsException("密码错误:" + userDetails);
        }
    }

    protected void doAfterPropertiesSet() throws Exception {
        Assert.notNull(this.userDetailsService, "A UserDetailsService must be set");
    }

    protected PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    protected SaltSource getSaltSource() {
        return saltSource;
    }

    protected LoginUserDetailsService getUserDetailsService() {
        return userDetailsService;
    }

    protected final UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
        UserDetails loadedUser;
        try {
            String password = (String) authentication.getCredentials();
            /**
             * 区别:这里使用的是自定义的验证方法
             */
            loadedUser = getUserDetailsService().loadUserByUsername(username, password);
        } catch (UsernameNotFoundException notFound) {
            throw notFound;
        } catch (Exception repositoryProblem) {
            throw new AuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
        }
        if (loadedUser == null) {
            throw new AuthenticationServiceException("用户信息为空");
        }
        return loadedUser;
    }

    public void setPasswordEncoder(Object passwordEncoder) {
        Assert.notNull(passwordEncoder, "passwordEncoder cannot be null");

        if (passwordEncoder instanceof PasswordEncoder) {
            this.passwordEncoder = (PasswordEncoder) passwordEncoder;
            return;
        }
        if (passwordEncoder instanceof org.springframework.security.crypto.password.PasswordEncoder) {
            final org.springframework.security.crypto.password.PasswordEncoder delegate = (org.springframework.security.crypto.password.PasswordEncoder) passwordEncoder;
            this.passwordEncoder = new PasswordEncoder() {
                private void checkSalt(Object salt) {
                    Assert.isNull(salt, "Salt value must be null when used with crypto module PasswordEncoder");
                }
                public String encodePassword(String rawPass, Object salt) {
                    checkSalt(salt);
                    return delegate.encode(rawPass);
                }
                public boolean isPasswordValid(String encPass, String rawPass, Object salt) {
                    checkSalt(salt);
                    return delegate.matches(rawPass, encPass);
                }
            };
            return;
        }
        throw new IllegalArgumentException("passwordEncoder must be a PasswordEncoder instance");
    }

    public void setSaltSource(SaltSource saltSource) {
        this.saltSource = saltSource;
    }
    public void setUserDetailsService(LoginUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
}
