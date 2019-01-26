package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsSummaryByThreadByEventName;
import java.util.List;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    int insert(EventsStatementsSummaryByThreadByEventName record);

    List<EventsStatementsSummaryByThreadByEventName> selectAll();
}