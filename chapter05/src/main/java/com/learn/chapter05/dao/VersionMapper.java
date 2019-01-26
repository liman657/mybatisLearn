package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Version;
import java.util.List;

public interface VersionMapper {
    int insert(Version record);

    List<Version> selectAll();
}