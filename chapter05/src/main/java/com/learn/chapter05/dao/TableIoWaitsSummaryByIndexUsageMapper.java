package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TableIoWaitsSummaryByIndexUsage;
import java.util.List;

public interface TableIoWaitsSummaryByIndexUsageMapper {
    int insert(TableIoWaitsSummaryByIndexUsage record);

    List<TableIoWaitsSummaryByIndexUsage> selectAll();
}