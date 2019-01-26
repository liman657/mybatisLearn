package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbCmp;
import java.util.List;

public interface InnodbCmpMapper {
    int insert(InnodbCmp record);

    List<InnodbCmp> selectAll();
}