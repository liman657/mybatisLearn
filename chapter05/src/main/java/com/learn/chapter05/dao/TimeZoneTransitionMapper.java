package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TimeZoneTransition;
import java.util.List;

public interface TimeZoneTransitionMapper {
    int insert(TimeZoneTransition record);

    List<TimeZoneTransition> selectAll();
}