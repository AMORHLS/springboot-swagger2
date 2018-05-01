package com.sunyard.backsystem.model.department;

import java.util.Date;

public class Department {
    private String id;

    private String cascadeid;

    private String name;

    private String hotkey;

    private String parentname;

    private Byte isleaf;

    private Byte isautoexpand;

    private String iconname;

    private Integer status;

    private Integer type;

    private String bizcode;

    private String customfield1;

    private Date createtime;

    private Integer createid;

    private Integer sortno;

    private String parentid;

    private Date updatetime;

    private String customcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCascadeid() {
        return cascadeid;
    }

    public void setCascadeid(String cascadeid) {
        this.cascadeid = cascadeid == null ? null : cascadeid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHotkey() {
        return hotkey;
    }

    public void setHotkey(String hotkey) {
        this.hotkey = hotkey == null ? null : hotkey.trim();
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public Byte getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(Byte isleaf) {
        this.isleaf = isleaf;
    }

    public Byte getIsautoexpand() {
        return isautoexpand;
    }

    public void setIsautoexpand(Byte isautoexpand) {
        this.isautoexpand = isautoexpand;
    }

    public String getIconname() {
        return iconname;
    }

    public void setIconname(String iconname) {
        this.iconname = iconname == null ? null : iconname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBizcode() {
        return bizcode;
    }

    public void setBizcode(String bizcode) {
        this.bizcode = bizcode == null ? null : bizcode.trim();
    }

    public String getCustomfield1() {
        return customfield1;
    }

    public void setCustomfield1(String customfield1) {
        this.customfield1 = customfield1 == null ? null : customfield1.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode == null ? null : customcode.trim();
    }
}