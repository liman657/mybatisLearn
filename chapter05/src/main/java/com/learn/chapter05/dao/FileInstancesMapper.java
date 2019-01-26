package com.learn.chapter05.dao;

import com.learn.chapter05.domain.FileInstances;
import java.util.List;

public interface FileInstancesMapper {
    int insert(FileInstances record);

    List<FileInstances> selectAll();
}