package com.sunyard.backsystem.service.login.impl;

import com.sunyard.backsystem.dao.login.User_RoleMapper;
import com.sunyard.backsystem.model.login.Role;
import com.sunyard.backsystem.model.login.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.sunyard.backsystem.service.login.impl
 * @Author: helishi
 * @CreateDate: 2017/10/27
 * @Description: 实现security 内置 UserDetailsService
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(getClass());

   @Autowired
   private User_RoleMapper user_roleMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User userInfo = null;
         if (userName==null || userName.length()==0){
            throw  new UsernameNotFoundException("用户名为空");
         }else {
             /**
              * 获取用户的权限,放到list.将list列表在放到UserDetails类型的对象中
              */
             //获取用户详情
             userInfo = user_roleMapper.queryUserRole(userName);
             //放入List
             List<Role> roles = userInfo.getRoles();
             List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
             for (Role role : roles){
                 list.add(new SimpleGrantedAuthority(role.getRoleName()));
                 logger.info(role.getRoleName());
             }
             UserDetails ud = new org.springframework.security.core.userdetails.User(
                     userInfo.getUserName(),userInfo.getPassword(),list);
             logger.info(userInfo.getUserName()+userInfo.getPassword());
             return ud;
         }

    }
}
