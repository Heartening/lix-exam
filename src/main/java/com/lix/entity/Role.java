package com.lix.entity;

import javax.persistence.*;

public class Role {
    @Id
    @Column(name = "roleID")
    private Integer roleid;

    @Column(name = "roleName")
    private String rolename;

    /**
     * 权限
     */
    private String permissions;

    /**
     * @return roleID
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * @return roleName
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * @param rolename
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 获取权限
     *
     * @return permissions - 权限
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * 设置权限
     *
     * @param permissions 权限
     */
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}