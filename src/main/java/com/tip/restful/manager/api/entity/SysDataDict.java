package com.tip.restful.manager.api.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldStrategy;
import com.tip.restful.core.entity.Annotation.RelationTable;
import com.tip.restful.core.entity.ModelBase;

import com.tip.restful.core.entity.IModelModifyer;
import com.tip.restful.core.entity.IModelCreator;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-23
 */
@TableName("SYS_DATA_DICT")
public class SysDataDict extends ModelBase<SysDataDict> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * 主键（取公共框架生成的GUID）
     */
    @TableId("DATA_DICT_ID")
    private String dataDictId;
    /**
     * SYS_SYSTEM_INFO/SYSTEM_id
     */
    @TableField("SYSTEM_ID")
    private String systemId;
    /**
     * 字典编码
     */
    @TableField("DICT_CODE")
    private String dictCode;
    /**
     * 字典名称
     */
    @TableField("DICT_NAME")
    private String dictName;
    /**
     * 备注
     */
    @TableField(value = "REMARK")
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
    /**
     * 可编辑：提供给业务部门编辑
     */
    @TableField("ISEDIT")
    private int isedit;


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

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
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

    public int getIsedit() {
        return isedit;
    }

    public void setIsedit(int isedit) {
        this.isedit = isedit;
    }

    @Override
    protected Serializable pkVal() {
        return this.dataDictId;
    }


    @RelationTable(name = "SysDataDictItem", relationkey = "DATA_DICT_ID")
    @TableField(exist = false)
    private List<SysDataDictItem> codeList;

    public List<SysDataDictItem> getCodeList() {
        if (codeList == null) {
            codeList = (List<SysDataDictItem>)
                    getRelationList("SysDataDictItem", "DATA_DICT_ID", pkVal());
        }
        return codeList;
    }

    public void setCodeList(List<SysDataDictItem> codeList) {
        this.codeList = codeList;
    }

}
