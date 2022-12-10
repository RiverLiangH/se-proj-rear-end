package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class StudentKey {
    private BigDecimal studentsId;

    private BigDecimal schoolId;

    public BigDecimal getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(BigDecimal studentsId) {
        this.studentsId = studentsId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}