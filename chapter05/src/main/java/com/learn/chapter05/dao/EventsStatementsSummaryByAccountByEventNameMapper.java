package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsSummaryByAccountByEventName;
import java.util.List;

public interface EventsStatementsSummaryByAccountByEventNameMapper {
    int insert(EventsStatementsSummaryByAccountByEventName record);

    List<EventsStatementsSummaryByAccountByEventName> selectAll();
}