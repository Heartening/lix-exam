package com.lix.entity;

import java.util.Date;
import javax.persistence.*;

public class Teacher {
    @Id
    @Column(name = "userID")
    private Integer userid;

    @Column(name = "userName")
    private String username;

    private String sex;

    @Column(name = "birthYear")
    private Date birthyear;

    /**
     * 学历
     */
    private String degree;

    /**
     * 职称
     */
    private String title;

    /**
     * 入职时间
     */
    private Date grade;

    /**
     * 院系
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
     * @return birthYear
     */
    public Date getBirthyear() {
        return birthyear;
    }

    /**
     * @param birthyear
     */
    public void setBirthyear(Date birthyear) {
        this.birthyear = birthyear;
    }

    /**
     * 获取学历
     *
     * @return degree - 学历
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置学历
     *
     * @param degree 学历
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 获取职称
     *
     * @return title - 职称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置职称
     *
     * @param title 职称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取入职时间
     *
     * @return grade - 入职时间
     */
    public Date getGrade() {
        return grade;
    }

    /**
     * 设置入职时间
     *
     * @param grade 入职时间
     */
    public void setGrade(Date grade) {
        this.grade = grade;
    }

    /**
     * 获取院系
     *
     * @return collegeID - 院系
     */
    public Integer getCollegeid() {
        return collegeid;
    }

    /**
     * 设置院系
     *
     * @param collegeid 院系
     */
    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }
}