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
 * 系统信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_SYSTEM_INFO")
public class SysSystemInfo extends ModelBase<SysSystemInfo> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId("SYSTEM_ID")
    private String systemId;
    /**
     * 
     */
    @TableField("SYSTEM_CODE")
    private String systemCode;
    /**
     * 
     */
    @TableField("SYSTEM_NAME")
    private String systemName;
    /**
     * 1=业务系统/2=外部系统
     */
    @TableField("SYSTEM_TYPE")
    private String systemType;
    /**
     *
     */
    @TableField("SYSTEM_URL")
    private String systemUrl;
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


    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
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
        return this.systemId; 
    }

    public String getSystemUrl() {
        return systemUrl;
    }

    public void setSystemUrl(String systemUrl) {
        this.systemUrl = systemUrl;
    }
}
