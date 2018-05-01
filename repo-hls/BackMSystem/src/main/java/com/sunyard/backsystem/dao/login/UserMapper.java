package com.sunyard.backsystem.dao.login;

import com.sunyard.backsystem.model.login.User;

import java.util.List;

/**
 * @Package: com.sunyard.backsystem.dao.login
 * @Author: helishi
 * @CreateDate: 2017/10/27
 * @Description:
 */
public interface UserMapper {

    Integer count();

    List<User> queryById(String id);

    User queryByUserName(String userName);

    int queryByUserPwd(String userName, String password);

}
