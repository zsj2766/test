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
 * 
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-23
 */
@TableName("SYS_DATA_DICT_ITEM")
public class SysDataDictItem extends ModelBase<SysDataDictItem> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * 主键（取公共框架生成的GUID）
     */
    @TableId("DATA_DICT_ITEM_ID")
    private String dataDictItemId;
    /**
     * SYS_DICTIONARIES/DICTIONARY_ID
     */
    @TableField("DATA_DICT_ID")
    private String dataDictId;
    /**
     * SYS_SYSTEM_INFO/SYSTEM_CODE
     */
    @TableField("SYSTEM_ID")
    private String systemId;
    /**
     * 字典项编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;
    /**
     * 字典项文本
     */
    @TableField("ITEM_TEXT")
    private String itemText;
    /**
     * 字典项RGB
     */
    @TableField("ITEM_RGB")
    private String itemRgb;
    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;
    /**
     * 状态：1=有效/0=无效
     */
    @TableField("STATE")
    private int state;
    /**
     * 排序
     */
    @TableField("ORDER_NO")
    private int orderNo;
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
    /**
     * 修改人ID
     */
    @TableField("MODIFIER_ID")
    private String modifierId;
    /**
     * 修改人姓名
     */
    @TableField("MODIFIER_NAME")
    private String modifierName;
    /**
     * 修改时间
     */
    @TableField("MODIFY_DATE")
    private Date modifyDate;


    public String getDataDictItemId() {
        return dataDictItemId;
    }

    public void setDataDictItemId(String dataDictItemId) {
        this.dataDictItemId = dataDictItemId;
    }

    public String getDataDictId() {
        return dataDictId;
    }

    public void setDataDictId(String dataDictId) {
        this.dataDictId = dataDictId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemText() {
        return itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public String getItemRgb() {
        return itemRgb;
    }

    public void setItemRgb(String itemRgb) {
        this.itemRgb = itemRgb;
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

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
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
        return this.dataDictItemId; 
    }
}
