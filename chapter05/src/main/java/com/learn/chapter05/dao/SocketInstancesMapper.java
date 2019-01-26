package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SocketInstances;
import java.util.List;

public interface SocketInstancesMapper {
    int insert(SocketInstances record);

    List<SocketInstances> selectAll();
}