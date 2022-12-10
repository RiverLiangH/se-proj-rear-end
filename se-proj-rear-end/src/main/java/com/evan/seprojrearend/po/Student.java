package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class Student extends StudentKey {
    private String name;

    private String mailAddress;

    private BigDecimal isBond;

    private BigDecimal isDeleted;

    private BigDecimal isAssistant;

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

    public BigDecimal getIsAssistant() {
        return isAssistant;
    }

    public void setIsAssistant(BigDecimal isAssistant) {
        this.isAssistant = isAssistant;
    }
}