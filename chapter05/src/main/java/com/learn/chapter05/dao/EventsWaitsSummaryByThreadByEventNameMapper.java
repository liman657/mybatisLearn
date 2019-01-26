package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsSummaryByThreadByEventName;
import java.util.List;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    int insert(EventsWaitsSummaryByThreadByEventName record);

    List<EventsWaitsSummaryByThreadByEventName> selectAll();
}