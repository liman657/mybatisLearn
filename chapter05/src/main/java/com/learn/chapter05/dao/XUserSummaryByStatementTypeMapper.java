package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XUserSummaryByStatementType;
import java.util.List;

public interface XUserSummaryByStatementTypeMapper {
    int insert(XUserSummaryByStatementType record);

    List<XUserSummaryByStatementType> selectAll();
}