package com.learn.chapter05.dao;

import com.learn.chapter05.domain.HelpTopic;
import java.util.List;

public interface HelpTopicMapper {
    int insert(HelpTopic record);

    List<HelpTopic> selectAll();
}