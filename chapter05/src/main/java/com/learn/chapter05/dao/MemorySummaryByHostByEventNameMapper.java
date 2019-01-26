package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemorySummaryByHostByEventName;
import java.util.List;

public interface MemorySummaryByHostByEventNameMapper {
    int insert(MemorySummaryByHostByEventName record);

    List<MemorySummaryByHostByEventName> selectAll();
}