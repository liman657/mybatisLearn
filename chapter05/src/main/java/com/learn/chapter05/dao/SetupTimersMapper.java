package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SetupTimers;
import java.util.List;

public interface SetupTimersMapper {
    int insert(SetupTimers record);

    List<SetupTimers> selectAll();
}