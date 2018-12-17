package com.tip.restful.manager.api.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tip.restful.core.entity.ModelBase;

import com.tip.restful.core.entity.IModelModifyer;
import com.tip.restful.core.entity.IModelCreator;

/**
 * <p>
 * 角色信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-31
 */
@TableName("SYS_ROLE_PERMISSION")
public class SysRolePermission extends ModelBase<SysRolePermission> implements IModelCreator {

    private static final long serialVersionUID = 1L;

    /**
     * 权限ID
     */
    @TableId("ROLE_PERMISSION_ID")
    private String rolePermissionId;
    /**
     * 角色ID：SYS_ROLE/ROLE_ID
     */
    @TableField("ROLE_ID")
    private String roleId;
    /**
     * 菜单ID：SYS_PERMISSION/MENU_ID
     */
    @TableField("MENU_ID")
    private String menuId;

    /**
     * 权限类型：1=正常权限；0=权限父级
     */
    @TableField("PERMISSION_TYPE")
    private String permissionType;

    /**
     * 创建人ID
     */
    @TableField("CREATOR_ID")
    private String creatorId;
    /**
     * 创建人姓名
     */
    @TableField("CREATOR_NAME")
    private String creatorName;
    /**
     * 创建时间
     */
    @TableField("CREATE_DATE")
    private Date createDate;


    public String getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(String rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public String getCreatorId() {
        return creatorId;
    }

    @Override
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public String getCreatorName() {
        return creatorName;
    }

    @Override
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.rolePermissionId;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }
}
