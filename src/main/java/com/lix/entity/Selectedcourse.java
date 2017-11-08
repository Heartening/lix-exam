package com.lix.entity;

import javax.persistence.*;

public class Selectedcourse {
    @Column(name = "courseID")
    private Integer courseid;

    @Column(name = "studentID")
    private Integer studentid;

    /**
     * 成绩
     */
    private Integer mark;

    /**
     * @return courseID
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * @param courseid
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * @return studentID
     */
    public Integer getStudentid() {
        return studentid;
    }

    /**
     * @param studentid
     */
    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    /**
     * 获取成绩
     *
     * @return mark - 成绩
     */
    public Integer getMark() {
        return mark;
    }

    /**
     * 设置成绩
     *
     * @param mark 成绩
     */
    public void setMark(Integer mark) {
        this.mark = mark;
    }
}