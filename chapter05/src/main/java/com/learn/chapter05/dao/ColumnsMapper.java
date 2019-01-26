package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Columns;
import java.util.List;

public interface ColumnsMapper {
    int insert(Columns record);

    List<Columns> selectAll();
}