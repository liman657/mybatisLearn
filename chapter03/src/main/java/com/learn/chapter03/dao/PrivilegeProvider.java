package com.learn.chapter03.dao;

import org.apache.ibatis.jdbc.SQL;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class PrivilegeProvider {

    public String selectById(final Long id) {
        return new SQL() {
            {
                SELECT("id,privilege_name,privilege_url");
                FROM("sys_privilege");
                WHERE("id=#{id}");
            }
        }.toString();
    }

}
