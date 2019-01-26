package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XStatementsWithTempTables;
import java.util.List;

public interface XStatementsWithTempTablesMapper {
    int insert(XStatementsWithTempTables record);

    List<XStatementsWithTempTables> selectAll();
}