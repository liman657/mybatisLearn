package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemorySummaryByThreadByEventName;
import java.util.List;

public interface MemorySummaryByThreadByEventNameMapper {
    int insert(MemorySummaryByThreadByEventName record);

    List<MemorySummaryByThreadByEventName> selectAll();
}