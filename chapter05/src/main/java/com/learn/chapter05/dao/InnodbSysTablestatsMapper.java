package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysTablestats;
import java.util.List;

public interface InnodbSysTablestatsMapper {
    int insert(InnodbSysTablestats record);

    List<InnodbSysTablestats> selectAll();
}