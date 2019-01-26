package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsSummaryByHostByEventName;
import java.util.List;

public interface EventsStatementsSummaryByHostByEventNameMapper {
    int insert(EventsStatementsSummaryByHostByEventName record);

    List<EventsStatementsSummaryByHostByEventName> selectAll();
}