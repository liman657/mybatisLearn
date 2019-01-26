package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EngineCost;
import java.util.List;

public interface EngineCostMapper {
    int insert(EngineCost record);

    List<EngineCost> selectAll();
}