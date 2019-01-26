package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsSummaryByUserByEventName;
import java.util.List;

public interface EventsTransactionsSummaryByUserByEventNameMapper {
    int insert(EventsTransactionsSummaryByUserByEventName record);

    List<EventsTransactionsSummaryByUserByEventName> selectAll();
}