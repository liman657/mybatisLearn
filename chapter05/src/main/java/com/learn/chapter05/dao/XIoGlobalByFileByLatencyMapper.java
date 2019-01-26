package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XIoGlobalByFileByLatency;
import java.util.List;

public interface XIoGlobalByFileByLatencyMapper {
    int insert(XIoGlobalByFileByLatency record);

    List<XIoGlobalByFileByLatency> selectAll();
}