package com.sunyard.backsystem.model.classficationmanagement;

public class Category {
    private String id;

    private Integer cascadeid;

    private String name;

    private Integer status;

    private Integer sortno;

    private String rootkey;

    private String rootname;

    private String parentid;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    public String getRootkey() {
        return rootkey;
    }

    public void setRootkey(String rootkey) {
        this.rootkey = rootkey == null ? null : rootkey.trim();
    }

    public String getRootname() {
        return rootname;
    }

    public void setRootname(String rootname) {
        this.rootname = rootname == null ? null : rootname.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }
}