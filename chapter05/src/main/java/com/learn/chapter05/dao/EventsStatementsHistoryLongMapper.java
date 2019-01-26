package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsHistoryLong;
import java.util.List;

public interface EventsStatementsHistoryLongMapper {
    int insert(EventsStatementsHistoryLong record);

    List<EventsStatementsHistoryLong> selectAll();
}