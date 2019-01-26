package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesSummaryGlobalByEventName;
import java.util.List;

public interface EventsStagesSummaryGlobalByEventNameMapper {
    int insert(EventsStagesSummaryGlobalByEventName record);

    List<EventsStagesSummaryGlobalByEventName> selectAll();
}