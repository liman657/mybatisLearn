package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsSummaryByInstance;
import java.util.List;

public interface EventsWaitsSummaryByInstanceMapper {
    int insert(EventsWaitsSummaryByInstance record);

    List<EventsWaitsSummaryByInstance> selectAll();
}