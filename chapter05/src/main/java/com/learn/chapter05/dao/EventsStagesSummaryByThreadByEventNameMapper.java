package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesSummaryByThreadByEventName;
import java.util.List;

public interface EventsStagesSummaryByThreadByEventNameMapper {
    int insert(EventsStagesSummaryByThreadByEventName record);

    List<EventsStagesSummaryByThreadByEventName> selectAll();
}