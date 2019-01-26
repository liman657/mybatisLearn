package com.learn.chapter05.domain;

import java.io.Serializable;

public class InnodbSysTablespaces implements Serializable {
    private Integer space;

    private String name;

    private Integer flag;

    private String fileFormat;

    private String rowFormat;

    private Integer pageSize;

    private Integer zipPageSize;

    private String spaceType;

    private Integer fsBlockSize;

    private Long fileSize;

    private Long allocatedSize;

    private static final long serialVersionUID = 1L;

    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat == null ? null : fileFormat.trim();
    }

    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat == null ? null : rowFormat.trim();
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getZipPageSize() {
        return zipPageSize;
    }

    public void setZipPageSize(Integer zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType == null ? null : spaceType.trim();
    }

    public Integer getFsBlockSize() {
        return fsBlockSize;
    }

    public void setFsBlockSize(Integer fsBlockSize) {
        this.fsBlockSize = fsBlockSize;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Long getAllocatedSize() {
        return allocatedSize;
    }

    public void setAllocatedSize(Long allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", space=").append(space);
        sb.append(", name=").append(name);
        sb.append(", flag=").append(flag);
        sb.append(", fileFormat=").append(fileFormat);
        sb.append(", rowFormat=").append(rowFormat);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", zipPageSize=").append(zipPageSize);
        sb.append(", spaceType=").append(spaceType);
        sb.append(", fsBlockSize=").append(fsBlockSize);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", allocatedSize=").append(allocatedSize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}