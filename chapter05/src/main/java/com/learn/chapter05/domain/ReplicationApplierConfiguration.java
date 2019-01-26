package com.learn.chapter05.domain;

import java.io.Serializable;

public class ReplicationApplierConfiguration implements Serializable {
    private String channelName;

    private Integer desiredDelay;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getDesiredDelay() {
        return desiredDelay;
    }

    public void setDesiredDelay(Integer desiredDelay) {
        this.desiredDelay = desiredDelay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", desiredDelay=").append(desiredDelay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}