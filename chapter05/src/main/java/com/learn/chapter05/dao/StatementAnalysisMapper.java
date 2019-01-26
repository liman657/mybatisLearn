package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatementAnalysis;
import java.util.List;

public interface StatementAnalysisMapper {
    int insert(StatementAnalysis record);

    List<StatementAnalysis> selectAll();
}