package com.learn.chapter09.mapper;

import com.learn.chapter09.domain.POJO.SysDict;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * autor:liman
 * comment:sysDict对应的mapper
 */
public interface DictMapper {

    SysDict selectByPrimaryKey(Long id);

    List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);

    int insert(SysDict sysDict);

    int updateById(SysDict sysDict);

    int deleteById(Long id);

}
