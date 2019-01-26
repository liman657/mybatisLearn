package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TimeZoneLeapSecond;
import java.util.List;

public interface TimeZoneLeapSecondMapper {
    int insert(TimeZoneLeapSecond record);

    List<TimeZoneLeapSecond> selectAll();
}