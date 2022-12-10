package com.evan.seprojrearend.po;

import java.math.BigDecimal;

public class ScoreInfo extends ScoreInfoKey {
    private BigDecimal score;

    private BigDecimal isDeleted;

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(BigDecimal isDeleted) {
        this.isDeleted = isDeleted;
    }
}