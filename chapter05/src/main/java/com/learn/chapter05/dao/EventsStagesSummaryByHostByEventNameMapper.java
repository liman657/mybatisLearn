package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesSummaryByHostByEventName;
import java.util.List;

public interface EventsStagesSummaryByHostByEventNameMapper {
    int insert(EventsStagesSummaryByHostByEventName record);

    List<EventsStagesSummaryByHostByEventName> selectAll();
}