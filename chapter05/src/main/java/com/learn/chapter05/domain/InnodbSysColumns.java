package com.learn.chapter05.domain;

import java.io.Serializable;

public class InnodbSysColumns implements Serializable {
    private Long tableId;

    private String name;

    private Long pos;

    private Integer mtype;

    private Integer prtype;

    private Integer len;

    private static final long serialVersionUID = 1L;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public Integer getMtype() {
        return mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    public Integer getPrtype() {
        return prtype;
    }

    public void setPrtype(Integer prtype) {
        this.prtype = prtype;
    }

    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", name=").append(name);
        sb.append(", pos=").append(pos);
        sb.append(", mtype=").append(mtype);
        sb.append(", prtype=").append(prtype);
        sb.append(", len=").append(len);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}