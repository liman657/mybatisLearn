package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SchemaObjectOverview;
import java.util.List;

public interface SchemaObjectOverviewMapper {
    int insert(SchemaObjectOverview record);

    List<SchemaObjectOverview> selectAll();
}