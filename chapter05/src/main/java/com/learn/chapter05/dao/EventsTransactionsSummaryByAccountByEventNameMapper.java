package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsSummaryByAccountByEventName;
import java.util.List;

public interface EventsTransactionsSummaryByAccountByEventNameMapper {
    int insert(EventsTransactionsSummaryByAccountByEventName record);

    List<EventsTransactionsSummaryByAccountByEventName> selectAll();
}