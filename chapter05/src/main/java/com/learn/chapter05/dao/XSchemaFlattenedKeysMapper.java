package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XSchemaFlattenedKeys;
import java.util.List;

public interface XSchemaFlattenedKeysMapper {
    int insert(XSchemaFlattenedKeys record);

    List<XSchemaFlattenedKeys> selectAll();
}