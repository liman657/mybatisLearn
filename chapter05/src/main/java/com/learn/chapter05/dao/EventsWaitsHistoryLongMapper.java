package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsHistoryLong;
import java.util.List;

public interface EventsWaitsHistoryLongMapper {
    int insert(EventsWaitsHistoryLong record);

    List<EventsWaitsHistoryLong> selectAll();
}