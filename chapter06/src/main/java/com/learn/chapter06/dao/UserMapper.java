package com.learn.chapter06.dao;

import com.learn.chapter06.domain.SysRole;
import com.learn.chapter06.domain.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface UserMapper {

    public List<SysUser> selectUserAndRoleByUserId(Long id);

    public List<SysUser> selectUserAndRoleById2(Long id);

    public List<SysUser> selectUserAndRoleByIdSelect(Long id);

}