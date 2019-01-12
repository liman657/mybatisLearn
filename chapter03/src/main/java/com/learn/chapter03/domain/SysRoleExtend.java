package com.learn.chapter03.domain;

/**
 * autor:liman
 * comment:
 */
public class SysRoleExtend extends SysRole {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "SysRoleExtend{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
