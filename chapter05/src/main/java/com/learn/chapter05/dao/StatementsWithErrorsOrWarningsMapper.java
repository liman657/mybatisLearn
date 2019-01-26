package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatementsWithErrorsOrWarnings;
import java.util.List;

public interface StatementsWithErrorsOrWarningsMapper {
    int insert(StatementsWithErrorsOrWarnings record);

    List<StatementsWithErrorsOrWarnings> selectAll();
}