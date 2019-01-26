package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TableLockWaitsSummaryByTable;
import java.util.List;

public interface TableLockWaitsSummaryByTableMapper {
    int insert(TableLockWaitsSummaryByTable record);

    List<TableLockWaitsSummaryByTable> selectAll();
}