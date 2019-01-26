package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsSummaryGlobalByEventName;
import java.util.List;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    int insert(EventsWaitsSummaryGlobalByEventName record);

    List<EventsWaitsSummaryGlobalByEventName> selectAll();
}