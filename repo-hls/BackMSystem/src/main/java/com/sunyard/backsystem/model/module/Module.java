package com.sunyard.backsystem.model.module;

import java.util.Date;

public class Module {
    private String id;

    private  Integer cascadeid;

    private String name;

    private String url;

    private String hotkey;

    private Byte isleaf;

    private Byte isautoexpand;

    private String iconname;

    private Integer status;

    private String parentname;

    private String vector;

    private Integer sortno;

    private String parentid;

    private Date creattime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCascadeid() {
        return cascadeid;
    }

    public void setCascadeid(Integer cascadeid) {
        this.cascadeid = cascadeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getHotkey() {
        return hotkey;
    }

    public void setHotkey(String hotkey) {
        this.hotkey = hotkey == null ? null : hotkey.trim();
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

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getVector() {
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector == null ? null : vector.trim();
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

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}