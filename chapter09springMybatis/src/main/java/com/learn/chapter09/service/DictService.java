package com.learn.chapter09.service;

import com.learn.chapter09.domain.POJO.SysDict;

import java.util.List;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public interface DictService {

    SysDict findById(Long id);

    List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit);

    boolean saveOrUpdate(SysDict sysDict);

    boolean deleteById(Long id);

}
