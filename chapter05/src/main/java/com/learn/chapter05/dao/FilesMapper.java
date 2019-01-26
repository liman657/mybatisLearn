package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Files;
import java.util.List;

public interface FilesMapper {
    int insert(Files record);

    List<Files> selectAll();
}