package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbBufferPage;
import java.util.List;

public interface InnodbBufferPageMapper {
    int insert(InnodbBufferPage record);

    List<InnodbBufferPage> selectAll();
}