package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HostSummaryByStatementLatency;
import java.util.List;

public interface HostSummaryByStatementLatencyMapper {
    int insert(HostSummaryByStatementLatency record);

    List<HostSummaryByStatementLatency> selectAll();
}