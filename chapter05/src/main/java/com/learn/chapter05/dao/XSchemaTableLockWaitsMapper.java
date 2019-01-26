package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XSchemaTableLockWaits;
import java.util.List;

public interface XSchemaTableLockWaitsMapper {
    int insert(XSchemaTableLockWaits record);

    List<XSchemaTableLockWaits> selectAll();
}