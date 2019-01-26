package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Events;
import java.util.List;

public interface EventsMapper {
    int insert(Events record);

    List<Events> selectAll();
}