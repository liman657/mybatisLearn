package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsCurrent;
import java.util.List;

public interface EventsStatementsCurrentMapper {
    int insert(EventsStatementsCurrent record);

    List<EventsStatementsCurrent> selectAll();
}