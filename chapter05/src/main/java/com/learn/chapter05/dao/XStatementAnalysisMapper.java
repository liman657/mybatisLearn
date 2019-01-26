package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XStatementAnalysis;
import java.util.List;

public interface XStatementAnalysisMapper {
    int insert(XStatementAnalysis record);

    List<XStatementAnalysis> selectAll();
}