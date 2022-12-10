package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class Literature extends LiteratureKey {
    private String autoIncrementName;

    private BigDecimal experimentId;

    private BigDecimal mark;

    private String litertureAddress;

    public String getAutoIncrementName() {
        return autoIncrementName;
    }

    public void setAutoIncrementName(String autoIncrementName) {
        this.autoIncrementName = autoIncrementName == null ? null : autoIncrementName.trim();
    }

    public BigDecimal getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(BigDecimal experimentId) {
        this.experimentId = experimentId;
    }

    public BigDecimal getMark() {
        return mark;
    }

    public void setMark(BigDecimal mark) {
        this.mark = mark;
    }

    public String getLitertureAddress() {
        return litertureAddress;
    }

    public void setLitertureAddress(String litertureAddress) {
        this.litertureAddress = litertureAddress == null ? null : litertureAddress.trim();
    }
}