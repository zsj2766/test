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
 * 内部部门信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_DEPARTMENT")
public class SysDepartment extends ModelBase<SysDepartment> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId("DEPT_ID")
    private String deptId;
    /**
     * 
     */
    @TableField("DEPT_CODE")
    private String deptCode;
    /**
     * 
     */
    @TableField("DEPT_NAME")
    private String deptName;
    /**
     * 
     */
    @TableField("FULL_NAME")
    private String fullName;
    /**
     * 
     */
    @TableField("LEVEL_CODE")
    private String levelCode;
    /**
     * SYS_DEPARTMENT/DEPT_ID
     */
    @TableField("PARENT_ID")
    private String parentId;
    /**
     * SYS_DEPARTMENT/DEPT_NAME
     */
    @TableField("PARENT_CODE")
    private String parentCode;
    /**
     * SYS_DEPARTMENT/DEPT_CODE
     */
    @TableField("PARENT_NAME")
    private String parentName;
    /**
     * 机构类型：1=集团；2=公司
     */
    @TableField("DEPT_TYPE")
    private String deptType;
    /**
     * 部门层级：1=部门；2=科室；3=其他
     */
    @TableField("DEPT_LEVEL")
    private String deptLevel;
    /**
     * 1=是/0=否
     */
    @TableField("IS_OA")
    private int isOa;
    /**
     * 
     */
    @TableField("BUGET_DEPT_ID")
    private String bugetDeptId;
    /**
     * 
     */
    @TableField("EXH_DEPT_ID")
    private String exhDeptId;
    /**
     * 
     */
    @TableField("CARD_DEPT_ID")
    private String cardDeptId;
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


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public String getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(String deptLevel) {
        this.deptLevel = deptLevel;
    }

    public int getIsOa() {
        return isOa;
    }

    public void setIsOa(int isOa) {
        this.isOa = isOa;
    }

    public String getBugetDeptId() {
        return bugetDeptId;
    }

    public void setBugetDeptId(String bugetDeptId) {
        this.bugetDeptId = bugetDeptId;
    }

    public String getExhDeptId() {
        return exhDeptId;
    }

    public void setExhDeptId(String exhDeptId) {
        this.exhDeptId = exhDeptId;
    }

    public String getCardDeptId() {
        return cardDeptId;
    }

    public void setCardDeptId(String cardDeptId) {
        this.cardDeptId = cardDeptId;
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
        return this.deptId; 
    }
}
