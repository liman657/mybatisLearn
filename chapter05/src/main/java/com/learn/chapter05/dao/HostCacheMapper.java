package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HostCache;
import java.util.List;

public interface HostCacheMapper {
    int insert(HostCache record);

    List<HostCache> selectAll();
}