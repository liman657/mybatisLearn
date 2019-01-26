package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbTableStats;
import java.util.List;

public interface InnodbTableStatsMapper {
    int insert(InnodbTableStats record);

    List<InnodbTableStats> selectAll();
}