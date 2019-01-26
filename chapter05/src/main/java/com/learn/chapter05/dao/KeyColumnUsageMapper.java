package com.learn.chapter05.dao;

import com.learn.chapter05.domain.KeyColumnUsage;
import java.util.List;

public interface KeyColumnUsageMapper {
    int insert(KeyColumnUsage record);

    List<KeyColumnUsage> selectAll();
}