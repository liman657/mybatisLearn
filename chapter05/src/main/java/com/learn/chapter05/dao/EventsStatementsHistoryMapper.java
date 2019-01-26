package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsHistory;
import java.util.List;

public interface EventsStatementsHistoryMapper {
    int insert(EventsStatementsHistory record);

    List<EventsStatementsHistory> selectAll();
}