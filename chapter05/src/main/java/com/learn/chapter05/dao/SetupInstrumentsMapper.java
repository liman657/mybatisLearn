package com.learn.chapter05.dao;

import com.learn.chapter05.domain.SetupInstruments;
import java.util.List;

public interface SetupInstrumentsMapper {
    int insert(SetupInstruments record);

    List<SetupInstruments> selectAll();
}