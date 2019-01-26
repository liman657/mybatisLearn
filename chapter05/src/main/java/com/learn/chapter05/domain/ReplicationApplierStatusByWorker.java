package com.learn.chapter05.domain;

import java.io.Serializable;
import java.util.Date;

public class ReplicationApplierStatusByWorker implements Serializable {
    private String channelName;

    private Long workerId;

    private Long threadId;

    private String serviceState;

    private String lastSeenTransaction;

    private Integer lastErrorNumber;

    private String lastErrorMessage;

    private Date lastErrorTimestamp;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }

    public String getLastSeenTransaction() {
        return lastSeenTransaction;
    }

    public void setLastSeenTransaction(String lastSeenTransaction) {
        this.lastSeenTransaction = lastSeenTransaction == null ? null : lastSeenTransaction.trim();
    }

    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage == null ? null : lastErrorMessage.trim();
    }

    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", workerId=").append(workerId);
        sb.append(", threadId=").append(threadId);
        sb.append(", serviceState=").append(serviceState);
        sb.append(", lastSeenTransaction=").append(lastSeenTransaction);
        sb.append(", lastErrorNumber=").append(lastErrorNumber);
        sb.append(", lastErrorMessage=").append(lastErrorMessage);
        sb.append(", lastErrorTimestamp=").append(lastErrorTimestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}