package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatementsWithSorting;
import java.util.List;

public interface StatementsWithSortingMapper {
    int insert(StatementsWithSorting record);

    List<StatementsWithSorting> selectAll();
}