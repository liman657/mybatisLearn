package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesHistoryLong;
import java.util.List;

public interface EventsStagesHistoryLongMapper {
    int insert(EventsStagesHistoryLong record);

    List<EventsStagesHistoryLong> selectAll();
}