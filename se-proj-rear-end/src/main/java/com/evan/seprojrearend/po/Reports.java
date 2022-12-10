package com.evan.seprojrearend.po;

import java.math.BigDecimal;
import java.util.Date;

public class Reports extends ReportsKey {
    private Date finData;

    private BigDecimal mark;

    private String reportAddress;

    private BigDecimal teacherId;

    public Date getFinData() {
        return finData;
    }

    public void setFinData(Date finData) {
        this.finData = finData;
    }

    public BigDecimal getMark() {
        return mark;
    }

    public void setMark(BigDecimal mark) {
        this.mark = mark;
    }

    public String getReportAddress() {
        return reportAddress;
    }

    public void setReportAddress(String reportAddress) {
        this.reportAddress = reportAddress == null ? null : reportAddress.trim();
    }

    public BigDecimal getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(BigDecimal teacherId) {
        this.teacherId = teacherId;
    }
}