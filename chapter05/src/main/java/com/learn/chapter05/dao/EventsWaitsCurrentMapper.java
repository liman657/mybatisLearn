package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsWaitsCurrent;
import java.util.List;

public interface EventsWaitsCurrentMapper {
    int insert(EventsWaitsCurrent record);

    List<EventsWaitsCurrent> selectAll();
}