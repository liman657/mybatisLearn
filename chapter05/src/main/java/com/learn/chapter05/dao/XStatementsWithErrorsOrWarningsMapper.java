package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XStatementsWithErrorsOrWarnings;
import java.util.List;

public interface XStatementsWithErrorsOrWarningsMapper {
    int insert(XStatementsWithErrorsOrWarnings record);

    List<XStatementsWithErrorsOrWarnings> selectAll();
}