package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class AdministratorKey {
    private BigDecimal adId;

    private BigDecimal schoolId;

    public BigDecimal getAdId() {
        return adId;
    }

    public void setAdId(BigDecimal adId) {
        this.adId = adId;
    }

    public BigDecimal getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(BigDecimal schoolId) {
        this.schoolId = schoolId;
    }
}