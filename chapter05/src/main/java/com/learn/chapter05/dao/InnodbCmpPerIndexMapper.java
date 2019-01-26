package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbCmpPerIndex;
import java.util.List;

public interface InnodbCmpPerIndexMapper {
    int insert(InnodbCmpPerIndex record);

    List<InnodbCmpPerIndex> selectAll();
}