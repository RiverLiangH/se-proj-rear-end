package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class SysSchoolMesKey {
    private String email;

    private BigDecimal schoolId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}