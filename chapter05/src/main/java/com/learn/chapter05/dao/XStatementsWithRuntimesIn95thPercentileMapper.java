package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XStatementsWithRuntimesIn95thPercentile;
import java.util.List;

public interface XStatementsWithRuntimesIn95thPercentileMapper {
    int insert(XStatementsWithRuntimesIn95thPercentile record);

    List<XStatementsWithRuntimesIn95thPercentile> selectAll();
}