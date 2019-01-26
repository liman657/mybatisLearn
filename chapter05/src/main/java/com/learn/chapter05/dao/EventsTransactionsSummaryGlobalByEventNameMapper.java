package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsSummaryGlobalByEventName;
import java.util.List;

public interface EventsTransactionsSummaryGlobalByEventNameMapper {
    int insert(EventsTransactionsSummaryGlobalByEventName record);

    List<EventsTransactionsSummaryGlobalByEventName> selectAll();
}