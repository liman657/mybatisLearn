package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsHistory;
import java.util.List;

public interface EventsWaitsHistoryMapper {
    int insert(EventsWaitsHistory record);

    List<EventsWaitsHistory> selectAll();
}