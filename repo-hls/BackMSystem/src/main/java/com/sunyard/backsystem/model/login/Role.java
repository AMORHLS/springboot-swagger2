package com.sunyard.backsystem.model.login;

import java.util.Date;
import java.util.List;

/**
 * @Package: com.sunyard.backsystem.model.login
 * @Author: helishi
 * @CreateDate: 2017/10/27
 * @Description: 角色类
 */
public class Role {
    private String roleId;
    private String roleName;
    private String status;
    private Integer type;
    private Date createTime;
    private String createId;
    private String customField;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }
}
