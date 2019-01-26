package com.learn.chapter05.dao;

import com.learn.chapter05.domain.MutexInstances;
import java.util.List;

public interface MutexInstancesMapper {
    int insert(MutexInstances record);

    List<MutexInstances> selectAll();
}