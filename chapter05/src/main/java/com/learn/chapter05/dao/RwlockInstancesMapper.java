package com.learn.chapter05.dao;

import com.learn.chapter05.domain.RwlockInstances;
import java.util.List;

public interface RwlockInstancesMapper {
    int insert(RwlockInstances record);

    List<RwlockInstances> selectAll();
}