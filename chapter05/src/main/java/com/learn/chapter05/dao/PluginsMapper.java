package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Plugins;
import java.util.List;

public interface PluginsMapper {
    int insert(Plugins record);

    List<Plugins> selectAll();
}