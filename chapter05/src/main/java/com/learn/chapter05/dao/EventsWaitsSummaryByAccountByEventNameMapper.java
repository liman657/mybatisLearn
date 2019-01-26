package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsSummaryByAccountByEventName;
import java.util.List;

public interface EventsWaitsSummaryByAccountByEventNameMapper {
    int insert(EventsWaitsSummaryByAccountByEventName record);

    List<EventsWaitsSummaryByAccountByEventName> selectAll();
}