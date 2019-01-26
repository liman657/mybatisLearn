package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbSysColumns;
import java.util.List;

public interface InnodbSysColumnsMapper {
    int insert(InnodbSysColumns record);

    List<InnodbSysColumns> selectAll();
}