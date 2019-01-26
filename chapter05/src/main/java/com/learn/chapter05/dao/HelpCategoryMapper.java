package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HelpCategory;
import java.util.List;

public interface HelpCategoryMapper {
    int insert(HelpCategory record);

    List<HelpCategory> selectAll();
}