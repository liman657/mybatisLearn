package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XSchemaTablesWithFullTableScans;
import java.util.List;

public interface XSchemaTablesWithFullTableScansMapper {
    int insert(XSchemaTablesWithFullTableScans record);

    List<XSchemaTablesWithFullTableScans> selectAll();
}