package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XSchemaTableStatisticsWithBuffer;
import java.util.List;

public interface XSchemaTableStatisticsWithBufferMapper {
    int insert(XSchemaTableStatisticsWithBuffer record);

    List<XSchemaTableStatisticsWithBuffer> selectAll();
}