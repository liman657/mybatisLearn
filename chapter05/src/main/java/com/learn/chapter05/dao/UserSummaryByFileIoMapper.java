package com.learn.chapter05.dao;

import com.learn.chapter05.domain.UserSummaryByFileIo;
import java.util.List;

public interface UserSummaryByFileIoMapper {
    int insert(UserSummaryByFileIo record);

    List<UserSummaryByFileIo> selectAll();
}