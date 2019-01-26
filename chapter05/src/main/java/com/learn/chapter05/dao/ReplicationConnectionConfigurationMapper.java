package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationConnectionConfiguration;
import java.util.List;

public interface ReplicationConnectionConfigurationMapper {
    int insert(ReplicationConnectionConfiguration record);

    List<ReplicationConnectionConfiguration> selectAll();
}