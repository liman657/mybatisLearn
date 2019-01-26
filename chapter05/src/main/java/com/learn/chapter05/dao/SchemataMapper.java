package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Schemata;
import java.util.List;

public interface SchemataMapper {
    int insert(Schemata record);

    List<Schemata> selectAll();
}