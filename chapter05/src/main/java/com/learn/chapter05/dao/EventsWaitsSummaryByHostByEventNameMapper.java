package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsSummaryByHostByEventName;
import java.util.List;

public interface EventsWaitsSummaryByHostByEventNameMapper {
    int insert(EventsWaitsSummaryByHostByEventName record);

    List<EventsWaitsSummaryByHostByEventName> selectAll();
}