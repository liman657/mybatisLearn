package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbMetrics;
import java.util.List;

public interface InnodbMetricsMapper {
    int insert(InnodbMetrics record);

    List<InnodbMetrics> selectAll();
}