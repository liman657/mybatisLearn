package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaUnusedIndexes;
import java.util.List;

public interface SchemaUnusedIndexesMapper {
    int insert(SchemaUnusedIndexes record);

    List<SchemaUnusedIndexes> selectAll();
}