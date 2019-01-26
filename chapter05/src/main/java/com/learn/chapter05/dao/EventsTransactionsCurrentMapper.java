package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsTransactionsCurrent;
import java.util.List;

public interface EventsTransactionsCurrentMapper {
    int insert(EventsTransactionsCurrent record);

    List<EventsTransactionsCurrent> selectAll();
}