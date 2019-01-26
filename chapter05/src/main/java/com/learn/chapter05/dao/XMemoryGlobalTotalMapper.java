package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XMemoryGlobalTotal;
import java.util.List;

public interface XMemoryGlobalTotalMapper {
    int insert(XMemoryGlobalTotal record);

    List<XMemoryGlobalTotal> selectAll();
}