package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Statistics;
import java.util.List;

public interface StatisticsMapper {
    int insert(Statistics record);

    List<Statistics> selectAll();
}