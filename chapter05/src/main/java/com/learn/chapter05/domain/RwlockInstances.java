package com.learn.chapter05.domain;

import java.io.Serializable;

public class RwlockInstances implements Serializable {
    private String name;

    private Long objectInstanceBegin;

    private Long writeLockedByThreadId;

    private Integer readLockedByCount;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Long getWriteLockedByThreadId() {
        return writeLockedByThreadId;
    }

    public void setWriteLockedByThreadId(Long writeLockedByThreadId) {
        this.writeLockedByThreadId = writeLockedByThreadId;
    }

    public Integer getReadLockedByCount() {
        return readLockedByCount;
    }

    public void setReadLockedByCount(Integer readLockedByCount) {
        this.readLockedByCount = readLockedByCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", writeLockedByThreadId=").append(writeLockedByThreadId);
        sb.append(", readLockedByCount=").append(readLockedByCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}