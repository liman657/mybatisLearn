package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TablesPriv;
import java.util.List;

public interface TablesPrivMapper {
    int insert(TablesPriv record);

    List<TablesPriv> selectAll();
}