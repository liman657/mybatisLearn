package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Collations;
import java.util.List;

public interface CollationsMapper {
    int insert(Collations record);

    List<Collations> selectAll();
}