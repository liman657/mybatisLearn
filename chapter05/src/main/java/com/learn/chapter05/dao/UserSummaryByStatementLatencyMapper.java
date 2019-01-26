package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserSummaryByStatementLatency;
import java.util.List;

public interface UserSummaryByStatementLatencyMapper {
    int insert(UserSummaryByStatementLatency record);

    List<UserSummaryByStatementLatency> selectAll();
}