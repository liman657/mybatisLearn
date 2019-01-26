package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XHostSummaryByStatementLatency;
import java.util.List;

public interface XHostSummaryByStatementLatencyMapper {
    int insert(XHostSummaryByStatementLatency record);

    List<XHostSummaryByStatementLatency> selectAll();
}