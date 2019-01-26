package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatementsWithRuntimesIn95thPercentile;
import java.util.List;

public interface StatementsWithRuntimesIn95thPercentileMapper {
    int insert(StatementsWithRuntimesIn95thPercentile record);

    List<StatementsWithRuntimesIn95thPercentile> selectAll();
}