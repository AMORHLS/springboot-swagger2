package com.sunyard.backsystem.service.login.impl;

import com.sunyard.backsystem.dao.login.UserMapper;
import com.sunyard.backsystem.model.login.User;
import com.sunyard.backsystem.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: com.sunyard.backsystem.service.login.impl
 * @Author: helishi
 * @CreateDate: 2017/10/30
 * @Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryByUserName(String userName) {
        return userMapper.queryByUserName(userName);
    }

    @Override
    public int queryByUserPwd(String userName, String password) {
        return queryByUserPwd(userName,password);
    }
}
