package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaTablesWithFullTableScans;
import java.util.List;

public interface SchemaTablesWithFullTableScansMapper {
    int insert(SchemaTablesWithFullTableScans record);

    List<SchemaTablesWithFullTableScans> selectAll();
}