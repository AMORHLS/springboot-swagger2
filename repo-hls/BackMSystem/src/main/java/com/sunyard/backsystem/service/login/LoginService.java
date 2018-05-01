package com.sunyard.backsystem.service.login;

import com.sunyard.backsystem.model.login.User;

/**
 * @Package: com.sunyard.backsystem.service.login
 * @Author: helishi
 * @CreateDate: 2017/10/30
 * @Description:
 */
public interface LoginService {

    User queryByUserName(String userName);

    int queryByUserPwd(String userName, String password);
}
