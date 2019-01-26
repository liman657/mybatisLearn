package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesSummaryByAccountByEventName;
import java.util.List;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    int insert(EventsStagesSummaryByAccountByEventName record);

    List<EventsStagesSummaryByAccountByEventName> selectAll();
}