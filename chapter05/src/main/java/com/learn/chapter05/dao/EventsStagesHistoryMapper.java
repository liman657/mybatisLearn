package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesHistory;
import java.util.List;

public interface EventsStagesHistoryMapper {
    int insert(EventsStagesHistory record);

    List<EventsStagesHistory> selectAll();
}