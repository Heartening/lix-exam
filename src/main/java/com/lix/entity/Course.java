package com.lix.entity;

import javax.persistence.*;

public class Course {
    @Id
    @Column(name = "courseID")
    private Integer courseid;

    /**
     * 课程名称
     */
    @Column(name = "courseName")
    private String coursename;

    @Column(name = "teacherID")
    private Integer teacherid;

    /**
     * 开课时间
     */
    @Column(name = "courseTime")
    private String coursetime;

    /**
     * 开课地点
     */
    @Column(name = "classRoom")
    private String classroom;

    /**
     * 学时
     */
    @Column(name = "courseWeek")
    private Integer courseweek;

    /**
     * 课程类型
     */
    @Column(name = "courseType")
    private String coursetype;

    /**
     * 所属院系
     */
    @Column(name = "collegeID")
    private Integer collegeid;

    /**
     * 学分
     */
    private Integer score;

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                ", teacherid=" + teacherid +
                ", coursetime='" + coursetime + '\'' +
                ", classroom='" + classroom + '\'' +
                ", courseweek=" + courseweek +
                ", coursetype='" + coursetype + '\'' +
                ", collegeid=" + collegeid +
                ", score=" + score +
                '}';
    }

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
     * 获取课程名称
     *
     * @return courseName - 课程名称
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * 设置课程名称
     *
     * @param coursename 课程名称
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    /**
     * @return teacherID
     */
    public Integer getTeacherid() {
        return teacherid;
    }

    /**
     * @param teacherid
     */
    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * 获取开课时间
     *
     * @return courseTime - 开课时间
     */
    public String getCoursetime() {
        return coursetime;
    }

    /**
     * 设置开课时间
     *
     * @param coursetime 开课时间
     */
    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime;
    }

    /**
     * 获取开课地点
     *
     * @return classRoom - 开课地点
     */
    public String getClassroom() {
        return classroom;
    }

    /**
     * 设置开课地点
     *
     * @param classroom 开课地点
     */
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    /**
     * 获取学时
     *
     * @return courseWeek - 学时
     */
    public Integer getCourseweek() {
        return courseweek;
    }

    /**
     * 设置学时
     *
     * @param courseweek 学时
     */
    public void setCourseweek(Integer courseweek) {
        this.courseweek = courseweek;
    }

    /**
     * 获取课程类型
     *
     * @return courseType - 课程类型
     */
    public String getCoursetype() {
        return coursetype;
    }

    /**
     * 设置课程类型
     *
     * @param coursetype 课程类型
     */
    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    /**
     * 获取所属院系
     *
     * @return collegeID - 所属院系
     */
    public Integer getCollegeid() {
        return collegeid;
    }

    /**
     * 设置所属院系
     *
     * @param collegeid 所属院系
     */
    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    /**
     * 获取学分
     *
     * @return score - 学分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置学分
     *
     * @param score 学分
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}