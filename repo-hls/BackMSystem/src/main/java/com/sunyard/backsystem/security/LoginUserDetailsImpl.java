package com.sunyard.backsystem.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Package: com.sunyard.backsystem.security
 * @Author: helishi
 * @CreateDate: 2017/11/4
 * @Description:
 */
public class LoginUserDetailsImpl extends User implements UserDetails {
    private static final long serialVersionUID = -5424897749887458053L;


    public LoginUserDetailsImpl(String username, String password, boolean enabled, boolean accountNonExpired,
                                boolean credentialsNonExpired, boolean accountNonLocked,
                                Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public LoginUserDetailsImpl(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public LoginUserDetailsImpl(String username, String password) {
        super(username, password, new ArrayList<GrantedAuthority>());
    }

}
