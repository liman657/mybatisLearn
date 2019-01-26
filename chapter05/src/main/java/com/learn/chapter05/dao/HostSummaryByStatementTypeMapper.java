package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HostSummaryByStatementType;
import java.util.List;

public interface HostSummaryByStatementTypeMapper {
    int insert(HostSummaryByStatementType record);

    List<HostSummaryByStatementType> selectAll();
}