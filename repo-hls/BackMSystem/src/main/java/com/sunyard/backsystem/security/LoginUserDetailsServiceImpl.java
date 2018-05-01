package com.sunyard.backsystem.security;

import com.sunyard.backsystem.dao.login.UserMapper;
import com.sunyard.backsystem.dao.login.User_RoleMapper;
import com.sunyard.backsystem.model.login.Role;
import com.sunyard.backsystem.model.login.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Package: com.sunyard.backsystem.security
 * @Author: helishi
 * @CreateDate: 2017/11/4
 * @Description:
 */
//@Component
public class LoginUserDetailsServiceImpl implements LoginUserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private User_RoleMapper user_roleMapper;
    /**
     * 进行登录验证
     */
    public UserDetails loadUserByUsername(String username, String password) throws UsernameNotFoundException {
        boolean result = this.validate(username, password);
        if (!result) {
            return null;
        }
        //获取用户详情
        User  userInfo = user_roleMapper.queryUserRole(username);
        List<Role> roles = userInfo.getRoles();
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (Role role : roles){
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        LoginUserDetailsImpl user = new LoginUserDetailsImpl(username, password,authorities);
        return user;
    }

    /**
     * 在此处验证
     * @param username
     * @param password
     * @return
     */
    private boolean validate(String username, String password) {
        /**
         * 在数据库获取用户信息进行验证
         */
        User user = userMapper.queryByUserName(username);
        if (user !=null){
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
