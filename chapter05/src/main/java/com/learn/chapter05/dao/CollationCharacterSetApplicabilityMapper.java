package com.learn.chapter05.dao;

import com.learn.chapter05.domain.CollationCharacterSetApplicability;
import java.util.List;

public interface CollationCharacterSetApplicabilityMapper {
    int insert(CollationCharacterSetApplicability record);

    List<CollationCharacterSetApplicability> selectAll();
}