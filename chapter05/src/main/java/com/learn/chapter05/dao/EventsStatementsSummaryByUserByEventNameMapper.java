package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsSummaryByUserByEventName;
import java.util.List;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    int insert(EventsStatementsSummaryByUserByEventName record);

    List<EventsStatementsSummaryByUserByEventName> selectAll();
}