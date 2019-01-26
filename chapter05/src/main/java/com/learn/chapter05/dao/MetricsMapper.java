package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Metrics;
import java.util.List;

public interface MetricsMapper {
    int insert(Metrics record);

    List<Metrics> selectAll();
}