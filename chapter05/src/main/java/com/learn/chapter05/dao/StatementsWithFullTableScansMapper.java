package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatementsWithFullTableScans;
import java.util.List;

public interface StatementsWithFullTableScansMapper {
    int insert(StatementsWithFullTableScans record);

    List<StatementsWithFullTableScans> selectAll();
}