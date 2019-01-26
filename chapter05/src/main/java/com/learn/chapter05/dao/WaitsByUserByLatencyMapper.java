package com.learn.chapter05.dao;

import com.learn.chapter05.domain.WaitsByUserByLatency;
import java.util.List;

public interface WaitsByUserByLatencyMapper {
    int insert(WaitsByUserByLatency record);

    List<WaitsByUserByLatency> selectAll();
}