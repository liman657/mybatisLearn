package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaTableStatistics;
import java.util.List;

public interface SchemaTableStatisticsMapper {
    int insert(SchemaTableStatistics record);

    List<SchemaTableStatistics> selectAll();
}