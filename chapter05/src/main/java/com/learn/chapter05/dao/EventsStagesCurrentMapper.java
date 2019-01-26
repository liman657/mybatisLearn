package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStagesCurrent;
import java.util.List;

public interface EventsStagesCurrentMapper {
    int insert(EventsStagesCurrent record);

    List<EventsStagesCurrent> selectAll();
}