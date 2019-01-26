package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbBufferPoolStats;
import java.util.List;

public interface InnodbBufferPoolStatsMapper {
    int insert(InnodbBufferPoolStats record);

    List<InnodbBufferPoolStats> selectAll();
}