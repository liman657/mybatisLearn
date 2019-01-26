package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaRedundantIndexes;
import java.util.List;

public interface SchemaRedundantIndexesMapper {
    int insert(SchemaRedundantIndexes record);

    List<SchemaRedundantIndexes> selectAll();
}