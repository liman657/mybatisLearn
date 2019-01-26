package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbFtIndexTable;
import java.util.List;

public interface InnodbFtIndexTableMapper {
    int insert(InnodbFtIndexTable record);

    List<InnodbFtIndexTable> selectAll();
}