package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Views;
import java.util.List;

public interface ViewsMapper {
    int insert(Views record);

    List<Views> selectAll();
}