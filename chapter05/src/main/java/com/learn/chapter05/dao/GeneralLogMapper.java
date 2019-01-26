package com.learn.chapter05.dao;

import com.learn.chapter05.domain.GeneralLog;
import java.util.List;

public interface GeneralLogMapper {
    int insert(GeneralLog record);

    List<GeneralLog> selectAll();
}