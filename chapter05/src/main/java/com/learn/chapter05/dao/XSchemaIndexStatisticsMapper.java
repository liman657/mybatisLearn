package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XSchemaIndexStatistics;
import java.util.List;

public interface XSchemaIndexStatisticsMapper {
    int insert(XSchemaIndexStatistics record);

    List<XSchemaIndexStatistics> selectAll();
}