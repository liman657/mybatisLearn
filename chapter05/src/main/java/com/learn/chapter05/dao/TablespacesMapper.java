package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Tablespaces;
import java.util.List;

public interface TablespacesMapper {
    int insert(Tablespaces record);

    List<Tablespaces> selectAll();
}