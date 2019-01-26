package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XSession;
import java.util.List;

public interface XSessionMapper {
    int insert(XSession record);

    List<XSession> selectAll();
}