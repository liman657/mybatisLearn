package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbBufferStatsByTable;
import java.util.List;

public interface InnodbBufferStatsByTableMapper {
    int insert(InnodbBufferStatsByTable record);

    List<InnodbBufferStatsByTable> selectAll();
}