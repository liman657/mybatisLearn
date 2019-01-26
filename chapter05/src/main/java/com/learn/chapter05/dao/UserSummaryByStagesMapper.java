package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserSummaryByStages;
import java.util.List;

public interface UserSummaryByStagesMapper {
    int insert(UserSummaryByStages record);

    List<UserSummaryByStages> selectAll();
}