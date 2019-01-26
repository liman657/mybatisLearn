package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XWaitClassesGlobalByAvgLatency;
import java.util.List;

public interface XWaitClassesGlobalByAvgLatencyMapper {
    int insert(XWaitClassesGlobalByAvgLatency record);

    List<XWaitClassesGlobalByAvgLatency> selectAll();
}