package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XIoGlobalByWaitByLatency;
import java.util.List;

public interface XIoGlobalByWaitByLatencyMapper {
    int insert(XIoGlobalByWaitByLatency record);

    List<XIoGlobalByWaitByLatency> selectAll();
}