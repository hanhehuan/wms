package com.example.hhh.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author hanhehuan
 * @create 2019-05-07 19:22
 */
public class Role implements Serializable {
    /**
     * 角色唯一标识符
     */
    private Integer rId;

    /**
     * 角色名称
     */

    private String rName;

    /**
     * 角色别名
     */

    private String rAlias;

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

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrAlias() {
        return rAlias;
    }

    public void setrAlias(String rAlias) {
        this.rAlias = rAlias;
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

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    private List<Permission> permissions;


    private static final long serialVersionUID = 1L;

}
