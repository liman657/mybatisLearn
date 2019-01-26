package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbBufferPageLru;
import java.util.List;

public interface InnodbBufferPageLruMapper {
    int insert(InnodbBufferPageLru record);

    List<InnodbBufferPageLru> selectAll();
}