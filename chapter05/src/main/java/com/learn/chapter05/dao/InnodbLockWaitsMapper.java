package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbLockWaits;
import java.util.List;

public interface InnodbLockWaitsMapper {
    int insert(InnodbLockWaits record);

    List<InnodbLockWaits> selectAll();
}