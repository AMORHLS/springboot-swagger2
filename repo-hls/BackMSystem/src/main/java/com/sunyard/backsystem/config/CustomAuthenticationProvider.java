package com.sunyard.backsystem.config;


import com.sunyard.backsystem.service.login.LoginService;
import com.sunyard.backsystem.service.login.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * @Package: com.sunyard.backsystem.config
 * @Author: helishi
 * @CreateDate: 2017/11/2
 * @Description:
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Autowired
    LoginService loginService;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        CustomWebAuthenticationDetails details = (CustomWebAuthenticationDetails) authentication.getDetails();
        UserDetails userDetails = null;
       /* if (details == null || details.getVerifyCode() == null){
           throw new BadCredentialsException("验证码为空！");
        }else {
            String verifyCode = details.getVerifyCode().trim();//getVerifyCode()为空
            String _code = details.get_code();
            if ( verifyCode == null && verifyCode.equals("") ) {
                if (!verifyCode.equalsIgnoreCase("_code") ) {
                    throw new BadCredentialsException("验证码错误！");
                }
            }
        }*/
            userDetails = userDetailsService.loadUserByUsername(authentication.getName());
            UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(
                    userDetails, authentication.getCredentials(),userDetails.getAuthorities());
            return result;

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
