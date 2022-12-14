package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class Course extends CourseKey {
    private String courseName;

    private BigDecimal resTeacherId;

    private BigDecimal isDeleted;

    private String courseOutline;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public BigDecimal getResTeacherId() {
        return resTeacherId;
    }

    public void setResTeacherId(BigDecimal resTeacherId) {
        this.resTeacherId = resTeacherId;
    }

    public BigDecimal getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(BigDecimal isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCourseOutline() {
        return courseOutline;
    }

    public void setCourseOutline(String courseOutline) {
        this.courseOutline = courseOutline == null ? null : courseOutline.trim();
    }
}