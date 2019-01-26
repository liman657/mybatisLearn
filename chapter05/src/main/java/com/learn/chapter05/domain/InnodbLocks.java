package com.learn.chapter05.domain;

import java.io.Serializable;

public class InnodbLocks implements Serializable {
    private String lockId;

    private String lockTrxId;

    private String lockMode;

    private String lockType;

    private String lockTable;

    private String lockIndex;

    private Long lockSpace;

    private Long lockPage;

    private Long lockRec;

    private String lockData;

    private static final long serialVersionUID = 1L;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId == null ? null : lockId.trim();
    }

    public String getLockTrxId() {
        return lockTrxId;
    }

    public void setLockTrxId(String lockTrxId) {
        this.lockTrxId = lockTrxId == null ? null : lockTrxId.trim();
    }

    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode == null ? null : lockMode.trim();
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType == null ? null : lockType.trim();
    }

    public String getLockTable() {
        return lockTable;
    }

    public void setLockTable(String lockTable) {
        this.lockTable = lockTable == null ? null : lockTable.trim();
    }

    public String getLockIndex() {
        return lockIndex;
    }

    public void setLockIndex(String lockIndex) {
        this.lockIndex = lockIndex == null ? null : lockIndex.trim();
    }

    public Long getLockSpace() {
        return lockSpace;
    }

    public void setLockSpace(Long lockSpace) {
        this.lockSpace = lockSpace;
    }

    public Long getLockPage() {
        return lockPage;
    }

    public void setLockPage(Long lockPage) {
        this.lockPage = lockPage;
    }

    public Long getLockRec() {
        return lockRec;
    }

    public void setLockRec(Long lockRec) {
        this.lockRec = lockRec;
    }

    public String getLockData() {
        return lockData;
    }

    public void setLockData(String lockData) {
        this.lockData = lockData == null ? null : lockData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lockId=").append(lockId);
        sb.append(", lockTrxId=").append(lockTrxId);
        sb.append(", lockMode=").append(lockMode);
        sb.append(", lockType=").append(lockType);
        sb.append(", lockTable=").append(lockTable);
        sb.append(", lockIndex=").append(lockIndex);
        sb.append(", lockSpace=").append(lockSpace);
        sb.append(", lockPage=").append(lockPage);
        sb.append(", lockRec=").append(lockRec);
        sb.append(", lockData=").append(lockData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}