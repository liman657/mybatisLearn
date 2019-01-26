package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MemorySummaryByAccountByEventName;
import java.util.List;

public interface MemorySummaryByAccountByEventNameMapper {
    int insert(MemorySummaryByAccountByEventName record);

    List<MemorySummaryByAccountByEventName> selectAll();
}