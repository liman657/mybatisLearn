package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Profiling;
import java.util.List;

public interface ProfilingMapper {
    int insert(Profiling record);

    List<Profiling> selectAll();
}