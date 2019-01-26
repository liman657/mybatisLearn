package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Hosts;
import java.util.List;

public interface HostsMapper {
    int insert(Hosts record);

    List<Hosts> selectAll();
}