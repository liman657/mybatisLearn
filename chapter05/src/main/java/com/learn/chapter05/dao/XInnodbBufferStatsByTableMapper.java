package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XInnodbBufferStatsByTable;
import java.util.List;

public interface XInnodbBufferStatsByTableMapper {
    int insert(XInnodbBufferStatsByTable record);

    List<XInnodbBufferStatsByTable> selectAll();
}