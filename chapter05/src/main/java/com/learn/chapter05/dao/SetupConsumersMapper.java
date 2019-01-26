package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SetupConsumers;
import java.util.List;

public interface SetupConsumersMapper {
    int insert(SetupConsumers record);

    List<SetupConsumers> selectAll();
}