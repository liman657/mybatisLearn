package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReferentialConstraints;
import java.util.List;

public interface ReferentialConstraintsMapper {
    int insert(ReferentialConstraints record);

    List<ReferentialConstraints> selectAll();
}