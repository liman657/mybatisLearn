package com.learn.chapter05.dao;

import com.learn.chapter05.domain.PerformanceTimers;
import java.util.List;

public interface PerformanceTimersMapper {
    int insert(PerformanceTimers record);

    List<PerformanceTimers> selectAll();
}