package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XStatementsWithFullTableScans;
import java.util.List;

public interface XStatementsWithFullTableScansMapper {
    int insert(XStatementsWithFullTableScans record);

    List<XStatementsWithFullTableScans> selectAll();
}