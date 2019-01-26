package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsSummaryByHostByEventName;
import java.util.List;

public interface EventsTransactionsSummaryByHostByEventNameMapper {
    int insert(EventsTransactionsSummaryByHostByEventName record);

    List<EventsTransactionsSummaryByHostByEventName> selectAll();
}