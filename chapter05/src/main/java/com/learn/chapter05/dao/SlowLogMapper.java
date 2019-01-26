package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SlowLog;
import java.util.List;

public interface SlowLogMapper {
    int insert(SlowLog record);

    List<SlowLog> selectAll();
}