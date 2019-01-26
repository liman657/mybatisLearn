package com.learn.chapter05.dao;

import com.learn.chapter05.domain.PreparedStatementsInstances;
import java.util.List;

public interface PreparedStatementsInstancesMapper {
    int insert(PreparedStatementsInstances record);

    List<PreparedStatementsInstances> selectAll();
}