package com.learn.chapter05.dao;

import com.learn.chapter05.domain.InnodbFtIndexCache;
import java.util.List;

public interface InnodbFtIndexCacheMapper {
    int insert(InnodbFtIndexCache record);

    List<InnodbFtIndexCache> selectAll();
}