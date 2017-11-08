package com.lix.entity;

import javax.persistence.*;

public class Userlogin {
    @Id
    @Column(name = "userID")
    private Integer userid;

    @Column(name = "userName")
    private String username;

    private String password;

    /**
     * 角色权限
     */
    private Integer role;

    /**
     * @return userID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取角色权限
     *
     * @return role - 角色权限
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色权限
     *
     * @param role 角色权限
     */
    public void setRole(Integer role) {
        this.role = role;
    }
}