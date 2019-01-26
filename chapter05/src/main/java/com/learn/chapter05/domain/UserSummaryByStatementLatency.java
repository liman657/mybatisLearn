package com.learn.chapter05.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserSummaryByStatementLatency implements Serializable {
    private String user;

    private BigDecimal total;

    private BigDecimal rowsSent;

    private BigDecimal rowsExamined;

    private BigDecimal rowsAffected;

    private BigDecimal fullScans;

    private String totalLatency;

    private String maxLatency;

    private String lockLatency;

    private static final long serialVersionUID = 1L;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(BigDecimal rowsSent) {
        this.rowsSent = rowsSent;
    }

    public BigDecimal getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(BigDecimal rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public BigDecimal getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(BigDecimal rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public BigDecimal getFullScans() {
        return fullScans;
    }

    public void setFullScans(BigDecimal fullScans) {
        this.fullScans = fullScans;
    }

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }

    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency == null ? null : lockLatency.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", total=").append(total);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsAffected=").append(rowsAffected);
        sb.append(", fullScans=").append(fullScans);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", lockLatency=").append(lockLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}