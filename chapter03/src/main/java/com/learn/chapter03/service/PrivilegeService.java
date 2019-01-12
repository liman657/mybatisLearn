package com.learn.chapter03.service;

import com.learn.chapter03.dao.PrivilegeMapper;
import com.learn.chapter03.dao.UserMapper;
import com.learn.chapter03.domain.SysPrivilege;
import com.learn.chapter03.domain.SysRole;
import com.learn.chapter03.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("privilegeService")
public class PrivilegeService {

    @Autowired
    private PrivilegeMapper privilegeMapper;

    public SysPrivilege selectSysPrivilegeById(Long id){
        return privilegeMapper.selectById(id);
    }

}