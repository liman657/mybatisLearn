package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Servers;
import java.util.List;

public interface ServersMapper {
    int insert(Servers record);

    List<Servers> selectAll();
}