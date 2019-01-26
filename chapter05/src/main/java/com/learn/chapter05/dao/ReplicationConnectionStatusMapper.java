package com.learn.chapter05.dao;

import com.learn.chapter05.domain.ReplicationConnectionStatus;
import java.util.List;

public interface ReplicationConnectionStatusMapper {
    int insert(ReplicationConnectionStatus record);

    List<ReplicationConnectionStatus> selectAll();
}