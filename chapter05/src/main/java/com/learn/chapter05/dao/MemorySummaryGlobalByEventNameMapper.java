package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemorySummaryGlobalByEventName;
import java.util.List;

public interface MemorySummaryGlobalByEventNameMapper {
    int insert(MemorySummaryGlobalByEventName record);

    List<MemorySummaryGlobalByEventName> selectAll();
}