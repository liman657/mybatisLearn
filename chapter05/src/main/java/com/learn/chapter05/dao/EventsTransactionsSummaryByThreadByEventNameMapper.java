package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsSummaryByThreadByEventName;
import java.util.List;

public interface EventsTransactionsSummaryByThreadByEventNameMapper {
    int insert(EventsTransactionsSummaryByThreadByEventName record);

    List<EventsTransactionsSummaryByThreadByEventName> selectAll();
}