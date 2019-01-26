package com.learn.chapter05.dao;

import com.learn.chapter05.domain.OptimizerTrace;
import java.util.List;

public interface OptimizerTraceMapper {
    int insert(OptimizerTrace record);

    List<OptimizerTrace> selectAll();
}