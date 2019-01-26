package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserSummaryByStatementType;
import java.util.List;

public interface UserSummaryByStatementTypeMapper {
    int insert(UserSummaryByStatementType record);

    List<UserSummaryByStatementType> selectAll();
}