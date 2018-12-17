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
 * 权限信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_PERMISSION")
public class SysPermission extends ModelBase<SysPermission> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId("PERMISSION_ID")
    private String permissionId;
    /**
     * 
     */
    @TableField("PERMISSION_CODE")
    private String permissionCode;
    /**
     * SYS_MENU/MENU_ID
     */
    @TableField("MENU_ID")
    private String menuId;
    /**
     * SYS_OPERATION/OPER_ID
     */
    @TableField("OPER_ID")
    private String operId;
    /**
     * 
     */
    @TableField("ORDER_NO")
    private int orderNo;
    /**
     * 1=启用/0=禁用
     */
    @TableField("STATE")
    private int state;
    /**
     * 
     */
    @TableField("CREATOR_ID")
    private String creatorId;
    /**
     * 
     */
    @TableField("CREATOR_NAME")
    private String creatorName;
    /**
     * 
     */
    @TableField("CREATE_DATE")
    private Date createDate;
    /**
     * 
     */
    @TableField("MODIFIER_ID")
    private String modifierId;
    /**
     * 
     */
    @TableField("MODIFIER_NAME")
    private String modifierName;
    /**
     * 
     */
    @TableField("MODIFY_DATE")
    private Date modifyDate;


    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
    public String getModifierId() {
        return modifierId;
    }

    @Override
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public String getModifierName() {
        return modifierName;
    }

    @Override
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    @Override
    public Date getModifyDate() {
        return modifyDate;
    }

    @Override
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.permissionId; 
    }
}
