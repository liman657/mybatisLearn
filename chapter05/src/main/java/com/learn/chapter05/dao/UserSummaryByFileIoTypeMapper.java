package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserSummaryByFileIoType;
import java.util.List;

public interface UserSummaryByFileIoTypeMapper {
    int insert(UserSummaryByFileIoType record);

    List<UserSummaryByFileIoType> selectAll();
}