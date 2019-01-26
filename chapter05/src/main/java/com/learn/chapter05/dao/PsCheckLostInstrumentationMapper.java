package com.learn.chapter05.dao;

import com.learn.chapter05.domain.PsCheckLostInstrumentation;
import java.util.List;

public interface PsCheckLostInstrumentationMapper {
    int insert(PsCheckLostInstrumentation record);

    List<PsCheckLostInstrumentation> selectAll();
}