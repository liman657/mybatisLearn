package com.learn.chapter05.dao;

import com.learn.chapter05.domain.StatusByHost;
import java.util.List;

public interface StatusByHostMapper {
    int insert(StatusByHost record);

    List<StatusByHost> selectAll();
}