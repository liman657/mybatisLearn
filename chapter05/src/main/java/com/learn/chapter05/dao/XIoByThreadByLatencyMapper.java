package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XIoByThreadByLatency;
import java.util.List;

public interface XIoByThreadByLatencyMapper {
    int insert(XIoByThreadByLatency record);

    List<XIoByThreadByLatency> selectAll();
}