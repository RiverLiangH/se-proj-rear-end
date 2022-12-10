package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class SectionMessageKey {
    private BigDecimal sectionId;

    private BigDecimal mesId;

    private BigDecimal schoolId;

    public BigDecimal getSectionId() {
        return sectionId;
    }

    public void setSectionId(BigDecimal sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getMesId() {
        return mesId;
    }

    public void setMesId(BigDecimal mesId) {
        this.mesId = mesId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}