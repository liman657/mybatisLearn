package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaTableLockWaits;
import java.util.List;

public interface SchemaTableLockWaitsMapper {
    int insert(SchemaTableLockWaits record);

    List<SchemaTableLockWaits> selectAll();
}