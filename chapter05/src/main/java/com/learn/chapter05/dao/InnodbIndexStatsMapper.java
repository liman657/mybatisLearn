package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbIndexStats;
import java.util.List;

public interface InnodbIndexStatsMapper {
    int insert(InnodbIndexStats record);

    List<InnodbIndexStats> selectAll();
}