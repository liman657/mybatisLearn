package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XStatementsWithSorting;
import java.util.List;

public interface XStatementsWithSortingMapper {
    int insert(XStatementsWithSorting record);

    List<XStatementsWithSorting> selectAll();
}