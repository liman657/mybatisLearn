package com.learn.chapter05.dao;

import com.learn.chapter05.domain.IoGlobalByFileByLatency;
import java.util.List;

public interface IoGlobalByFileByLatencyMapper {
    int insert(IoGlobalByFileByLatency record);

    List<IoGlobalByFileByLatency> selectAll();
}