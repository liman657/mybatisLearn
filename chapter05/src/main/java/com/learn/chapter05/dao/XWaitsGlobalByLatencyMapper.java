package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XWaitsGlobalByLatency;
import java.util.List;

public interface XWaitsGlobalByLatencyMapper {
    int insert(XWaitsGlobalByLatency record);

    List<XWaitsGlobalByLatency> selectAll();
}