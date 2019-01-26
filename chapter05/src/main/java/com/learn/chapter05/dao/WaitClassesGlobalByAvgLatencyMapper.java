package com.learn.chapter05.dao;

import com.learn.chapter05.domain.WaitClassesGlobalByAvgLatency;
import java.util.List;

public interface WaitClassesGlobalByAvgLatencyMapper {
    int insert(WaitClassesGlobalByAvgLatency record);

    List<WaitClassesGlobalByAvgLatency> selectAll();
}