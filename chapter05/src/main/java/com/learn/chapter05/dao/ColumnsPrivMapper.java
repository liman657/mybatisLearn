package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ColumnsPriv;
import java.util.List;

public interface ColumnsPrivMapper {
    int insert(ColumnsPriv record);

    List<ColumnsPriv> selectAll();
}