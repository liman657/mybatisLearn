package com.learn.chapter05.domain;

import java.io.Serializable;

public class HelpRelation implements Serializable {
    private Integer helpTopicId;

    private Integer helpKeywordId;

    private static final long serialVersionUID = 1L;

    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    public Integer getHelpKeywordId() {
        return helpKeywordId;
    }

    public void setHelpKeywordId(Integer helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpTopicId=").append(helpTopicId);
        sb.append(", helpKeywordId=").append(helpKeywordId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}