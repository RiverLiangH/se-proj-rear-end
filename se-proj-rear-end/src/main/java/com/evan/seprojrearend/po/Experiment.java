package com.evan.seprojrearend.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Experiment extends ExperimentKey {
    private String experimentName;

    private BigDecimal sectionId;

    private BigDecimal teacherId;

    private BigDecimal isDeleted;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date deadline;

    private String experimentContext;

    public String getExperimentName() {
        return experimentName;
    }

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName == null ? null : experimentName.trim();
    }

    public BigDecimal getSectionId() {
        return sectionId;
    }

    public void setSectionId(BigDecimal sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(BigDecimal teacherId) {
        this.teacherId = teacherId;
    }

    public BigDecimal getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(BigDecimal isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getExperimentContext() {
        return experimentContext;
    }

    public void setExperimentContext(String experimentContext) {
        this.experimentContext = experimentContext == null ? null : experimentContext.trim();
    }
}