package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class SectionInfo extends SectionInfoKey {
    private BigDecimal isDeleted;

    public BigDecimal getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(BigDecimal isDeleted) {
        this.isDeleted = isDeleted;
    }
}