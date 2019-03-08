package com.learn.chaper07cache.domain.POJO;

import java.io.Serializable;
import java.util.Date;

/**
 * autor:liman
 * comment:
 */
public class SysRole implements Serializable {

    private static final long serialVersionUID = 2102581069057338799L;
    private Long id;
    private String roleName;
    private Integer enabled;
    private String createBy;
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", enabled=" + enabled +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}