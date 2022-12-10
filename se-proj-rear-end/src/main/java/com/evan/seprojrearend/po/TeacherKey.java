package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class TeacherKey {
    private BigDecimal teacherId;

    private BigDecimal schoolId;

    public BigDecimal getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(BigDecimal teacherId) {
        this.teacherId = teacherId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}