package com.learn.chapter05.dao;

import com.learn.chapter05.domain.Parameters;
import java.util.List;

public interface ParametersMapper {
    int insert(Parameters record);

    List<Parameters> selectAll();
}