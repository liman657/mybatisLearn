package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbCmpmem;
import java.util.List;

public interface InnodbCmpmemMapper {
    int insert(InnodbCmpmem record);

    List<InnodbCmpmem> selectAll();
}