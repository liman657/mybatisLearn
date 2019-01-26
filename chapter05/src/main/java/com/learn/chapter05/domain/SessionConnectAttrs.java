package com.learn.chapter05.domain;

import java.io.Serializable;

public class SessionConnectAttrs implements Serializable {
    private Integer processlistId;

    private String attrName;

    private String attrValue;

    private Integer ordinalPosition;

    private static final long serialVersionUID = 1L;

    public Integer getProcesslistId() {
        return processlistId;
    }

    public void setProcesslistId(Integer processlistId) {
        this.processlistId = processlistId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processlistId=").append(processlistId);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", ordinalPosition=").append(ordinalPosition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}