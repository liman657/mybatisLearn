package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TableHandles;
import java.util.List;

public interface TableHandlesMapper {
    int insert(TableHandles record);

    List<TableHandles> selectAll();
}