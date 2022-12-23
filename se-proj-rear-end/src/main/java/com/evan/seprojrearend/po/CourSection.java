package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class CourSection extends CourSectionKey {
    private BigDecimal teacherId;

    private BigDecimal courseId;

    private String sectionTime;

    private BigDecimal isComplete;

    private BigDecimal isDelete;

    private String message;

    public BigDecimal getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(BigDecimal teacherId) {
        this.teacherId = teacherId;
    }

    public BigDecimal getCourseId() {
        return courseId;
    }

    public void setCourseId(BigDecimal courseId) {
        this.courseId = courseId;
    }

    public String getSectionTime() {
        return sectionTime;
    }

    public void setSectionTime(String sectionTime) {
        this.sectionTime = sectionTime == null ? null : sectionTime.trim();
    }

    public BigDecimal getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(BigDecimal isComplete) {
        this.isComplete = isComplete;
    }

    public BigDecimal getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(BigDecimal isDelete) {
        this.isDelete = isDelete;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}