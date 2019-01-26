package com.learn.chapter05.dao;

import com.learn.chapter05.domain.CharacterSets;
import java.util.List;

public interface CharacterSetsMapper {
    int insert(CharacterSets record);

    List<CharacterSets> selectAll();
}