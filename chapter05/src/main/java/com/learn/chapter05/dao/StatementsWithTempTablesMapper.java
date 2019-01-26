package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatementsWithTempTables;
import java.util.List;

public interface StatementsWithTempTablesMapper {
    int insert(StatementsWithTempTables record);

    List<StatementsWithTempTables> selectAll();
}