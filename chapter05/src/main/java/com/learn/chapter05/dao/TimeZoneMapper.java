package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TimeZone;
import java.util.List;

public interface TimeZoneMapper {
    int insert(TimeZone record);

    List<TimeZone> selectAll();
}