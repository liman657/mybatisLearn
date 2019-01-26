package com.learn.chapter05.dao;

import com.learn.chapter05.domain.EventsStatementsSummaryByProgram;
import java.util.List;

public interface EventsStatementsSummaryByProgramMapper {
    int insert(EventsStatementsSummaryByProgram record);

    List<EventsStatementsSummaryByProgram> selectAll();
}