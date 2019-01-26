package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsSummaryGlobalByEventName;
import java.util.List;

public interface EventsStatementsSummaryGlobalByEventNameMapper {
    int insert(EventsStatementsSummaryGlobalByEventName record);

    List<EventsStatementsSummaryGlobalByEventName> selectAll();
}