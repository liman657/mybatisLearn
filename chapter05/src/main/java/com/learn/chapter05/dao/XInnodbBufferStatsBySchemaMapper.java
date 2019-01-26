package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XInnodbBufferStatsBySchema;
import java.util.List;

public interface XInnodbBufferStatsBySchemaMapper {
    int insert(XInnodbBufferStatsBySchema record);

    List<XInnodbBufferStatsBySchema> selectAll();
}