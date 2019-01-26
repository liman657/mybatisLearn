package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XProcesslist;
import java.util.List;

public interface XProcesslistMapper {
    int insert(XProcesslist record);

    List<XProcesslist> selectAll();
}