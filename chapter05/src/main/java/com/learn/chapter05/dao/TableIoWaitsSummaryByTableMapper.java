package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TableIoWaitsSummaryByTable;
import java.util.List;

public interface TableIoWaitsSummaryByTableMapper {
    int insert(TableIoWaitsSummaryByTable record);

    List<TableIoWaitsSummaryByTable> selectAll();
}