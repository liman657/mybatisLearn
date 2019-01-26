package com.learn.chapter05.dao;

import com.learn.chapter05.domain.IoGlobalByWaitByLatency;
import java.util.List;

public interface IoGlobalByWaitByLatencyMapper {
    int insert(IoGlobalByWaitByLatency record);

    List<IoGlobalByWaitByLatency> selectAll();
}