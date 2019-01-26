package com.learn.chapter05.domain;

import java.io.Serializable;

public class InnodbTempTableInfo implements Serializable {
    private Long tableId;

    private String name;

    private Integer nCols;

    private Integer space;

    private String perTableTablespace;

    private String isCompressed;

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

    public Integer getnCols() {
        return nCols;
    }

    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public String getPerTableTablespace() {
        return perTableTablespace;
    }

    public void setPerTableTablespace(String perTableTablespace) {
        this.perTableTablespace = perTableTablespace == null ? null : perTableTablespace.trim();
    }

    public String getIsCompressed() {
        return isCompressed;
    }

    public void setIsCompressed(String isCompressed) {
        this.isCompressed = isCompressed == null ? null : isCompressed.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", name=").append(name);
        sb.append(", nCols=").append(nCols);
        sb.append(", space=").append(space);
        sb.append(", perTableTablespace=").append(perTableTablespace);
        sb.append(", isCompressed=").append(isCompressed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}