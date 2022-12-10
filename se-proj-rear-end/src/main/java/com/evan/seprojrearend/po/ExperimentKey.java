package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class ExperimentKey {
    private BigDecimal experimentId;

    private BigDecimal schoolId;

    public BigDecimal getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(BigDecimal experimentId) {
        this.experimentId = experimentId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}