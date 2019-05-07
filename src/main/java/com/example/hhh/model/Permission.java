package com.example.hhh.model;

import java.io.Serializable;

/**
 * @author hanhehuan
 * @create 2019-05-07 19:25
 */
public class Permission implements Serializable {
    /**
     * 权限唯一标识ID
     */
    private Integer pId;

    /**
     * 权限名称
     */
    private String pName;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpAlias() {
        return pAlias;
    }

    public void setpAlias(String pAlias) {
        this.pAlias = pAlias;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 权限别名
     */
    private String pAlias;

    /**
     * 创建时间
     */
    private Long created;

    /**
     * 修改时间
     */
    private Long updated;

    /**
     * 创建时间字符串
     */
    private String createdAt;

    /**
     * 修改时间字符串
     */
    private String updatedAt;

    private static final long serialVersionUID = 1L;
}
