package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XInnodbLockWaits;
import java.util.List;

public interface XInnodbLockWaitsMapper {
    int insert(XInnodbLockWaits record);

    List<XInnodbLockWaits> selectAll();
}