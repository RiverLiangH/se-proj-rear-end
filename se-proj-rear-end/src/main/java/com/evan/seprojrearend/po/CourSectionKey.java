package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class CourSectionKey {
    private BigDecimal sectionId;

    private BigDecimal schoolId;

    public BigDecimal getSectionId() {
        return sectionId;
    }

    public void setSectionId(BigDecimal sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}