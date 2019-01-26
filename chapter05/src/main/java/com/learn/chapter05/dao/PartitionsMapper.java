package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Partitions;
import java.util.List;

public interface PartitionsMapper {
    int insert(Partitions record);

    List<Partitions> selectAll();
}