package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesSummaryByUserByEventName;
import java.util.List;

public interface EventsStagesSummaryByUserByEventNameMapper {
    int insert(EventsStagesSummaryByUserByEventName record);

    List<EventsStagesSummaryByUserByEventName> selectAll();
}