package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ServerCost;
import java.util.List;

public interface ServerCostMapper {
    int insert(ServerCost record);

    List<ServerCost> selectAll();
}