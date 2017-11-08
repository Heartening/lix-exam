package com.lix.entity;

import javax.persistence.*;

@Table(name = "college")
public class College {
    @Id
    @Column(name = "collegeID")
    private Integer collegeid;

    /**
     * 课程名
     */
    @Column(name = "collegeName")
    private String collegename;

    /**
     * @return collegeID
     */
    public Integer getCollegeid() {
        return collegeid;
    }

    /**
     * @param collegeid
     */
    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    /**
     * 获取课程名
     *
     * @return collegeName - 课程名
     */
    public String getCollegename() {
        return collegename;
    }

    /**
     * 设置课程名
     *
     * @param collegename 课程名
     */
    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
}