package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaIndexStatistics;
import java.util.List;

public interface SchemaIndexStatisticsMapper {
    int insert(SchemaIndexStatistics record);

    List<SchemaIndexStatistics> selectAll();
}