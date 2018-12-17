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
 * 操作信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_OPERATION")
public class SysOperation extends ModelBase<SysOperation> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("OPER_ID")
    private String operId;
    /**
     * 操作名称
     */
    @TableField("OPER_NAME")
    private String operName;
    /**
     * 操作编码
     */
    @TableField("OPER_CODE")
    private String operCode;
    /**
     * 
     */
    @TableField("OPER_FUN")
    private String operFun;
    /**
     * 
     */
    @TableField("OPER_ICON")
    private String operIcon;
    /**
     * 操作类型
     */
    @TableField("OPER_TYPES")
    private String operTypes;
    /**
     * 
     */
    @TableField("CLIENT_ID")
    private String clientId;
    /**
     * 
     */
    @TableField("GROUP_NO")
    private int groupNo;
    /**
     * 下拉按钮ID:操作类型为3是才有
     */
    @TableField("PARENT_ID")
    private String parentId;
    /**
     * 
     */
    @TableField("REMARK")
    private String remark;
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


    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperFun() {
        return operFun;
    }

    public void setOperFun(String operFun) {
        this.operFun = operFun;
    }

    public String getOperIcon() {
        return operIcon;
    }

    public void setOperIcon(String operIcon) {
        this.operIcon = operIcon;
    }

    public String getOperTypes() {
        return operTypes;
    }

    public void setOperTypes(String operTypes) {
        this.operTypes = operTypes;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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
        return this.operId; 
    }
}
