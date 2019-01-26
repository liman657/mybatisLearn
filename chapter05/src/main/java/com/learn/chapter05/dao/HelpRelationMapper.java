package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HelpRelation;
import java.util.List;

public interface HelpRelationMapper {
    int insert(HelpRelation record);

    List<HelpRelation> selectAll();
}