package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class Teacher extends TeacherKey {
    private String name;

    private String mailAddress;

    private BigDecimal isBond;

    private BigDecimal isDeleted;

    private BigDecimal isResponse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress == null ? null : mailAddress.trim();
    }

    public BigDecimal getIsBond() {
        return isBond;
    }

    public void setIsBond(BigDecimal isBond) {
        this.isBond = isBond;
    }

    public BigDecimal getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(BigDecimal isDeleted) {
        this.isDeleted = isDeleted;
    }

    public BigDecimal getIsResponse() {
        return isResponse;
    }

    public void setIsResponse(BigDecimal isResponse) {
        this.isResponse = isResponse;
    }
}