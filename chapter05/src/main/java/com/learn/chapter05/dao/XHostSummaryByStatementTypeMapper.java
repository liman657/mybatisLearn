package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XHostSummaryByStatementType;
import java.util.List;

public interface XHostSummaryByStatementTypeMapper {
    int insert(XHostSummaryByStatementType record);

    List<XHostSummaryByStatementType> selectAll();
}