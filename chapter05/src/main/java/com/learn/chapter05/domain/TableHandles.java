package com.learn.chapter05.domain;

import java.io.Serializable;

public class TableHandles implements Serializable {
    private String objectType;

    private String objectSchema;

    private String objectName;

    private Long objectInstanceBegin;

    private Long ownerThreadId;

    private Long ownerEventId;

    private String internalLock;

    private String externalLock;

    private static final long serialVersionUID = 1L;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    public Long getOwnerEventId() {
        return ownerEventId;
    }

    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    public String getInternalLock() {
        return internalLock;
    }

    public void setInternalLock(String internalLock) {
        this.internalLock = internalLock == null ? null : internalLock.trim();
    }

    public String getExternalLock() {
        return externalLock;
    }

    public void setExternalLock(String externalLock) {
        this.externalLock = externalLock == null ? null : externalLock.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", ownerThreadId=").append(ownerThreadId);
        sb.append(", ownerEventId=").append(ownerEventId);
        sb.append(", internalLock=").append(internalLock);
        sb.append(", externalLock=").append(externalLock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}