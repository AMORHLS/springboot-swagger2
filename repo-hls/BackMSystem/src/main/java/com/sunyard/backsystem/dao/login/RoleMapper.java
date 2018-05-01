package com.sunyard.backsystem.dao.login;

import com.sunyard.backsystem.model.login.Role;

import java.util.List;

/**
 * @Package: com.sunyard.backsystem.dao.login
 * @Author: helishi
 * @CreateDate: 2017/10/27
 * @Description:
 */
public interface RoleMapper {


    Role selectByRoleName(Role role);
    List<Role> queryById(String id);



}
