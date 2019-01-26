package com.learn.chapter05.dao;

import com.learn.chapter05.domain.WaitsByHostByLatency;
import java.util.List;

public interface WaitsByHostByLatencyMapper {
    int insert(WaitsByHostByLatency record);

    List<WaitsByHostByLatency> selectAll();
}