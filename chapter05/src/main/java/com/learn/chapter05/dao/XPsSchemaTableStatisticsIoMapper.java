package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XPsSchemaTableStatisticsIo;
import java.util.List;

public interface XPsSchemaTableStatisticsIoMapper {
    int insert(XPsSchemaTableStatisticsIo record);

    List<XPsSchemaTableStatisticsIo> selectAll();
}