package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TimeZoneTransitionType;
import java.util.List;

public interface TimeZoneTransitionTypeMapper {
    int insert(TimeZoneTransitionType record);

    List<TimeZoneTransitionType> selectAll();
}