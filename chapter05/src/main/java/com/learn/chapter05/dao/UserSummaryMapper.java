package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserSummary;
import java.util.List;

public interface UserSummaryMapper {
    int insert(UserSummary record);

    List<UserSummary> selectAll();
}