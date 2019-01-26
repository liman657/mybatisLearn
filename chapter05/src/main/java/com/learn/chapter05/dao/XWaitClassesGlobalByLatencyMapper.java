package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XWaitClassesGlobalByLatency;
import java.util.List;

public interface XWaitClassesGlobalByLatencyMapper {
    int insert(XWaitClassesGlobalByLatency record);

    List<XWaitClassesGlobalByLatency> selectAll();
}