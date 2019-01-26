package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysTables;
import java.util.List;

public interface InnodbSysTablesMapper {
    int insert(InnodbSysTables record);

    List<InnodbSysTables> selectAll();
}