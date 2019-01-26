package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsSummaryByUserByEventName;
import java.util.List;

public interface EventsWaitsSummaryByUserByEventNameMapper {
    int insert(EventsWaitsSummaryByUserByEventName record);

    List<EventsWaitsSummaryByUserByEventName> selectAll();
}