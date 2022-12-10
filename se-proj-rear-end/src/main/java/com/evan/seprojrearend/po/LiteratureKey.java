package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class LiteratureKey {
    private BigDecimal literatureId;

    private BigDecimal schoolId;

    public BigDecimal getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(BigDecimal literatureId) {
        this.literatureId = literatureId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}