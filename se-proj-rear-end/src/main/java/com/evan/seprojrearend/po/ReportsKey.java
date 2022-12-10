package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class ReportsKey {
    private BigDecimal experimentId;

    private BigDecimal studentId;

    private BigDecimal schoolId;

    public BigDecimal getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(BigDecimal experimentId) {
        this.experimentId = experimentId;
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