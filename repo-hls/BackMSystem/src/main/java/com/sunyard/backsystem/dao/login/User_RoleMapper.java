package com.sunyard.backsystem.dao.login;

import com.sunyard.backsystem.model.login.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Package: com.sunyard.backsystem.dao.login
 * @Author: helishi
 * @CreateDate: 2017/10/27
 * @Description:
 */
@Component
public interface User_RoleMapper {
    User queryUserRole(String userName);
    Integer countUser();
}
