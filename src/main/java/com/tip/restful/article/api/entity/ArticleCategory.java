package com.tip.restful.article.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tip.restful.core.entity.IModelCreator;
import com.tip.restful.core.entity.IModelModifyer;
import com.tip.restful.core.entity.ModelBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 文章分类
 * @author 庞亦华
 * @since 20181003
 * @version  0.1
 */

@ApiModel("文章分类")
@TableName("article_category")
public class ArticleCategory extends ModelBase<ArticleCategory> implements IModelCreator, IModelModifyer {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章分类主键，GUID")
    @TableId("category_id")
    private String categoryId;

    @ApiModelProperty("分类")
    @TableField("category")
    @NotBlank(message = "分类没有填哦！")
    @Length(max = 20, message = "分类超长....了！")
    private String category;

    @ApiModelProperty("部门")
    @TableField("department")
    @NotBlank(message = "部门没有填哦！")
    @Length(max = 40, message = "部门超长....了！")
    private String department;

    @ApiModelProperty("部门ID")
    @TableField("department_id")
    @NotBlank(message = "部门ID" + "没有填哦！")
    @Length(max = 40, message = "部门ID" + "超长....了！")
    private String departmentID;

    @ApiModelProperty("创建人ID")
    @TableField("creator_id")
    private String creatorId;

    @ApiModelProperty("创建人姓名")
    @TableField("creator_name")
    private String creatorName;

    @ApiModelProperty("创建日期")
    @TableField("create_date")
    private Date createDate;

    @ApiModelProperty("修改人ID")
    @TableField("modifier_id")
    private String modifierId;

    @ApiModelProperty("修改人姓名")
    @TableField("modifier_name")
    private String modifierName;

    @ApiModelProperty("修改日期")
    @TableField("modify_date")
    private Date modifyDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
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
        return this.categoryId;
    }
}
