package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsSummaryByDigest;
import java.util.List;

public interface EventsStatementsSummaryByDigestMapper {
    int insert(EventsStatementsSummaryByDigest record);

    List<EventsStatementsSummaryByDigest> selectAll();
}