package com.lix.entity;

import java.util.Date;
import javax.persistence.*;

public class Student {
    @Id
    @Column(name = "userID")
    private Integer userid;

    @Column(name = "userName")
    private String username;

    private String sex;

    /**
     * 出生日期
     */
    @Column(name = "birthYear")
    private Date birthyear;

    /**
     * 入学时间
     */
    private Date grade;

    /**
     * 院系id
     */
    @Column(name = "collegeID")
    private Integer collegeid;

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
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取出生日期
     *
     * @return birthYear - 出生日期
     */
    public Date getBirthyear() {
        return birthyear;
    }

    /**
     * 设置出生日期
     *
     * @param birthyear 出生日期
     */
    public void setBirthyear(Date birthyear) {
        this.birthyear = birthyear;
    }

    /**
     * 获取入学时间
     *
     * @return grade - 入学时间
     */
    public Date getGrade() {
        return grade;
    }

    /**
     * 设置入学时间
     *
     * @param grade 入学时间
     */
    public void setGrade(Date grade) {
        this.grade = grade;
    }

    /**
     * 获取院系id
     *
     * @return collegeID - 院系id
     */
    public Integer getCollegeid() {
        return collegeid;
    }

    /**
     * 设置院系id
     *
     * @param collegeid 院系id
     */
    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }
}