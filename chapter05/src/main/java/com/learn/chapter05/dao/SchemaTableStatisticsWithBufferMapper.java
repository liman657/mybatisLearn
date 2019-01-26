package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaTableStatisticsWithBuffer;
import java.util.List;

public interface SchemaTableStatisticsWithBufferMapper {
    int insert(SchemaTableStatisticsWithBuffer record);

    List<SchemaTableStatisticsWithBuffer> selectAll();
}