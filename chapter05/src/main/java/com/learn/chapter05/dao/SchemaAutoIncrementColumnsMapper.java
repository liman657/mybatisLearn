package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaAutoIncrementColumns;
import java.util.List;

public interface SchemaAutoIncrementColumnsMapper {
    int insert(SchemaAutoIncrementColumns record);

    List<SchemaAutoIncrementColumns> selectAll();
}