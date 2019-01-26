package com.learn.chapter05.domain;

import java.io.Serializable;

public class NdbBinlogIndex implements Serializable {
    private Long position;

    private String file;

    private Long epoch;

    private Integer inserts;

    private Integer updates;

    private Integer deletes;

    private Integer schemaops;

    private Integer origServerId;

    private Long origEpoch;

    private Integer gci;

    private Long nextPosition;

    private String nextFile;

    private static final long serialVersionUID = 1L;

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public Integer getInserts() {
        return inserts;
    }

    public void setInserts(Integer inserts) {
        this.inserts = inserts;
    }

    public Integer getUpdates() {
        return updates;
    }

    public void setUpdates(Integer updates) {
        this.updates = updates;
    }

    public Integer getDeletes() {
        return deletes;
    }

    public void setDeletes(Integer deletes) {
        this.deletes = deletes;
    }

    public Integer getSchemaops() {
        return schemaops;
    }

    public void setSchemaops(Integer schemaops) {
        this.schemaops = schemaops;
    }

    public Integer getOrigServerId() {
        return origServerId;
    }

    public void setOrigServerId(Integer origServerId) {
        this.origServerId = origServerId;
    }

    public Long getOrigEpoch() {
        return origEpoch;
    }

    public void setOrigEpoch(Long origEpoch) {
        this.origEpoch = origEpoch;
    }

    public Integer getGci() {
        return gci;
    }

    public void setGci(Integer gci) {
        this.gci = gci;
    }

    public Long getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(Long nextPosition) {
        this.nextPosition = nextPosition;
    }

    public String getNextFile() {
        return nextFile;
    }

    public void setNextFile(String nextFile) {
        this.nextFile = nextFile == null ? null : nextFile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", position=").append(position);
        sb.append(", file=").append(file);
        sb.append(", epoch=").append(epoch);
        sb.append(", inserts=").append(inserts);
        sb.append(", updates=").append(updates);
        sb.append(", deletes=").append(deletes);
        sb.append(", schemaops=").append(schemaops);
        sb.append(", origServerId=").append(origServerId);
        sb.append(", origEpoch=").append(origEpoch);
        sb.append(", gci=").append(gci);
        sb.append(", nextPosition=").append(nextPosition);
        sb.append(", nextFile=").append(nextFile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}