package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class CourseKey {
    private BigDecimal courseId;

    private BigDecimal schoolId;

    public BigDecimal getCourseId() {
        return courseId;
    }

    public void setCourseId(BigDecimal courseId) {
        this.courseId = courseId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}