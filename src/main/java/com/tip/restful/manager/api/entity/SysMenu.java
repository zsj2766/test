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
 * 菜单信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_MENU")
public class SysMenu extends ModelBase<SysMenu> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId("MENU_ID")
    private String menuId;
    /**
     * 
     */
    @TableField("MENU_NAME")
    private String menuName;
    /**
     * 
     */
    @TableField("MENU_CODE")
    private String menuCode;
    /**
     * 
     */
    @TableField("MENU_URL")
    private String menuUrl;
    /**
     * 
     */
    @TableField("MENU_ICON")
    private String menuIcon;
    /**
     * 
     */
    @TableField("IMG_URL")
    private String imgUrl;

    /**
     * 
     */
    @TableField("LEVEL_CODE")
    private String levelCode;
    /**
     * SYS_MENU/MENU_ID
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

    @TableField("OPER_FUNC")
    private String operFunc;


    @TableField("MENU_TYPE")
    private String menuType;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
        return this.menuId; 
    }

    public String getOperFunc() {
        return operFunc;
    }

    public void setOperFunc(String operFunc) {
        this.operFunc = operFunc;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }
}
