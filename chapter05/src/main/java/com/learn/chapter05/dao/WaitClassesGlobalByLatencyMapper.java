package com.learn.chapter05.dao;

import com.learn.chapter05.domain.WaitClassesGlobalByLatency;
import java.util.List;

public interface WaitClassesGlobalByLatencyMapper {
    int insert(WaitClassesGlobalByLatency record);

    List<WaitClassesGlobalByLatency> selectAll();
}