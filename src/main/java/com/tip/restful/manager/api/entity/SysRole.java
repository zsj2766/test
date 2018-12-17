package com.tip.restful.manager.api.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
 * @since 2018-07-11
 */
@TableName("SYS_ROLE")
public class SysRole extends ModelBase<SysRole> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId("ROLE_ID")
    private String roleId;
    /**
     *
     */
    @TableField("ROLE_NAME")
    private String roleName;
    /**
     * 0：普通角色，1：系统角色
     */
    @TableField("ROLE_TYPE")
    private int roleType;
    /**
     *
     */
    @TableField("ROLE_LEVEL")
    private int roleLevel;
    /**
     *
     */
    @TableField("PARENT_ID")
    private String parentId;
    /**
     * SYS_SYSTEM_INFO/SYSTEM_ID
     */
    @TableField("SYSTEM_ID")
    private String systemId;
    /**
     *
     */
    @TableField("ORDER_NO")
    private int orderNo;
    /**
     *
     */
    @TableField("REMARK")
    private String remark;
    /**
     *
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

    @TableField(exist = false)
    private List<String> authList;

    @TableField(exist = false)
    private List<String> parentAuthList;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return this.roleId;
    }

    public List<String> getAuthList() {
        return authList;
    }

    public void setAuthList(List<String> authList) {
        this.authList = authList;
    }

    public List<String> getParentAuthList() {
        return parentAuthList;
    }

    public void setParentAuthList(List<String> parentAuthList) {
        this.parentAuthList = parentAuthList;
    }
}
