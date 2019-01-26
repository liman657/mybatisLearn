package com.learn.chapter05.dao;

import com.learn.chapter05.domain.CondInstances;
import java.util.List;

public interface CondInstancesMapper {
    int insert(CondInstances record);

    List<CondInstances> selectAll();
}