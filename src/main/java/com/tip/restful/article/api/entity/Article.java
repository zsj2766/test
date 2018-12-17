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
 * 公司内部文章管理
 * @author 庞亦华
 * @since 2018-9-1
 * @version 0.1 新建文章模块
 * @since  2018-10-1
 * @version 0.2 增加验证内容，增加置顶、目录、原创、简介字段
 */

@ApiModel("文章")
@TableName("article")
public class Article extends ModelBase<Article> implements IModelCreator, IModelModifyer {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章主键，GUID")
    @TableId("ARTICLE_ID")
    private String articleId;

    @ApiModelProperty("标题")
    @TableField("title")
    @NotBlank(message = "文章标题没有填哦！")
    @Length(max = 200, message = "标题超长....了！")
    private String title;

    @ApiModelProperty("作者")
    @TableField(value="author")
    @NotBlank(message = "作者这么重要，不能不填！")
    @Length(max = 50, message = "作者不用这么夸张吧，太多字了！")
    private String author;

    @ApiModelProperty("封面图片地址")
    @TableField(value="cover_image")
    private String coverImage;

    @ApiModelProperty("内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("置顶")
    @TableField("top")
    private Integer top;

    @ApiModelProperty("关键字")
    @TableField(value="keywords")
    @Length(max = 200, message = "关键字咋这么长呢，超了！")
    private String keywords;

    @ApiModelProperty("分类ID")
    @TableField("category_id")
    private String categoryId;

    @ApiModelProperty("分类")
    @TableField("category")
    private String category;

    @ApiModelProperty("原创")
    @TableField("original")
    private Integer original;

    @ApiModelProperty("简介")
    @TableField(value="description")
    @Length(max = 300, message = "简介咋这么长呢，超了！")
    private String description;

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

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
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

    public Integer getOriginal() {
        return original;
    }

    public void setOriginal(Integer original) {
        this.original = original;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return this.articleId;
    }
}
