package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbBufferStatsBySchema;
import java.util.List;

public interface InnodbBufferStatsBySchemaMapper {
    int insert(InnodbBufferStatsBySchema record);

    List<InnodbBufferStatsBySchema> selectAll();
}