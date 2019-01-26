package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XSchemaTableStatistics;
import java.util.List;

public interface XSchemaTableStatisticsMapper {
    int insert(XSchemaTableStatistics record);

    List<XSchemaTableStatistics> selectAll();
}