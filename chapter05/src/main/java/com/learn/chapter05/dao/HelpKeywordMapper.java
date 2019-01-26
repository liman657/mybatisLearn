package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HelpKeyword;
import java.util.List;

public interface HelpKeywordMapper {
    int insert(HelpKeyword record);

    List<HelpKeyword> selectAll();
}