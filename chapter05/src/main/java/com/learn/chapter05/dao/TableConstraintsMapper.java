package com.learn.chapter05.dao;

import com.learn.chapter05.domain.TableConstraints;
import java.util.List;

public interface TableConstraintsMapper {
    int insert(TableConstraints record);

    List<TableConstraints> selectAll();
}