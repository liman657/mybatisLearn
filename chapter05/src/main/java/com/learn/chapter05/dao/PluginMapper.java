package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Plugin;
import java.util.List;

public interface PluginMapper {
    int insert(Plugin record);

    List<Plugin> selectAll();
}