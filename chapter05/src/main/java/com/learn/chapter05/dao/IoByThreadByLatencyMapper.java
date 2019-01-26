package com.learn.chapter05.dao;

import com.learn.chapter05.domain.IoByThreadByLatency;
import java.util.List;

public interface IoByThreadByLatencyMapper {
    int insert(IoByThreadByLatency record);

    List<IoByThreadByLatency> selectAll();
}