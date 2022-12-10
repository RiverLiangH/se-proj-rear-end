package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class ScoreInfoKey {
    private BigDecimal sectionId;

    private BigDecimal studentId;

    private BigDecimal schoolId;

    public BigDecimal getSectionId() {
        return sectionId;
    }

    public void setSectionId(BigDecimal sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getStudentId() {
        return studentId;
    }

    public void setStudentId(BigDecimal studentId) {
        this.studentId = studentId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}