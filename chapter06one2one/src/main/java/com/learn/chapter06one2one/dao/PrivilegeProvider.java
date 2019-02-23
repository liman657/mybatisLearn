package com.learn.chapter06one2one.dao;

import org.apache.ibatis.jdbc.SQL;

/**
 * autor:liman
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
