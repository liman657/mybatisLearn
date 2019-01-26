package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemorySummaryByUserByEventName;
import java.util.List;

public interface MemorySummaryByUserByEventNameMapper {
    int insert(MemorySummaryByUserByEventName record);

    List<MemorySummaryByUserByEventName> selectAll();
}