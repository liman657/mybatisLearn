package com.learn.chapter02.dao;

import com.learn.chapter02.domain.SysRole;
import com.learn.chapter02.domain.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface UserMapper {

    SysUser getUserById(Integer id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesByUserId(Integer userId);

}