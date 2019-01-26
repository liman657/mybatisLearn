package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XUserSummaryByStatementLatency;
import java.util.List;

public interface XUserSummaryByStatementLatencyMapper {
    int insert(XUserSummaryByStatementLatency record);

    List<XUserSummaryByStatementLatency> selectAll();
}