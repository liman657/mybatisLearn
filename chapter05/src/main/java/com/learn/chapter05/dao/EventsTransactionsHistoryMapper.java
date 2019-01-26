package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsHistory;
import java.util.List;

public interface EventsTransactionsHistoryMapper {
    int insert(EventsTransactionsHistory record);

    List<EventsTransactionsHistory> selectAll();
}