package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsHistoryLong;
import java.util.List;

public interface EventsTransactionsHistoryLongMapper {
    int insert(EventsTransactionsHistoryLong record);

    List<EventsTransactionsHistoryLong> selectAll();
}