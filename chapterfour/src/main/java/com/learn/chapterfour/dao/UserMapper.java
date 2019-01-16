package com.learn.chapterfour.dao;

import com.learn.chapterfour.domain.SysRole;
import com.learn.chapterfour.domain.SysUser;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Repository
public interface UserMapper {

    public SysUser selectByUserNameAndEmail(@Param("userName") String userName,@Param("userEmail") String userEmail);

    public SysUser selectByDynamicSQL(@Param("userName") String userName,@Param("userEmail") String userEmail);

    public int updateByIdSelective(SysUser sysUser);

    public SysUser selectUserById(Long id);

    public int insertSysUserDynamicSQL(SysUser sysUser);
}