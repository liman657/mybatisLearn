package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TimeZoneName;
import java.util.List;

public interface TimeZoneNameMapper {
    int insert(TimeZoneName record);

    List<TimeZoneName> selectAll();
}