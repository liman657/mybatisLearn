package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Triggers;
import java.util.List;

public interface TriggersMapper {
    int insert(Triggers record);

    List<Triggers> selectAll();
}