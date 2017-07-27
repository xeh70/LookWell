package cn.bdqn.tangcco.LookWell.entity;

import java.util.Date;

public class Course {
    private Integer courseId;

    private Term term;

    private Date addTime;

    private Date lastUpdate;

    private byte[] courseName;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public byte[] getCourseName() {
        return courseName;
    }

    public void setCourseName(byte[] courseName) {
        this.courseName = courseName;
    }
}