package com.learn.chapter05.dao;

import com.learn.chapter05.domain.WaitsGlobalByLatency;
import java.util.List;

public interface WaitsGlobalByLatencyMapper {
    int insert(WaitsGlobalByLatency record);

    List<WaitsGlobalByLatency> selectAll();
}