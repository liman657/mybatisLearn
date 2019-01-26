package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbLocks;
import java.util.List;

public interface InnodbLocksMapper {
    int insert(InnodbLocks record);

    List<InnodbLocks> selectAll();
}