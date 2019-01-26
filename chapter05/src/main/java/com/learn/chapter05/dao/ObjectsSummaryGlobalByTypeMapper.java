package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ObjectsSummaryGlobalByType;
import java.util.List;

public interface ObjectsSummaryGlobalByTypeMapper {
    int insert(ObjectsSummaryGlobalByType record);

    List<ObjectsSummaryGlobalByType> selectAll();
}