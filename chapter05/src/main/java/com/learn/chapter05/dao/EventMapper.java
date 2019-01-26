package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Event;
import java.util.List;

public interface EventMapper {
    int insert(Event record);

    List<Event> selectAll();
}