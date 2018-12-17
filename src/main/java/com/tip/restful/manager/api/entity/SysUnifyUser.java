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
 * 统一用户信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_UNIFY_USER")
public class SysUnifyUser extends ModelBase<SysUnifyUser> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId("USER_ID")
    private String userId;
    /**
     * 
     */
    @TableField("USER_NAME")
    private String userName;
    /**
     * 
     */
    @TableField("ACCOUNT")
    private String account;
    /**
     * 
     */
    @TableField("PASSWORD")
    private String password;
    /**
     * 来源：1=OA/2=外部
     */
    @TableField("SOURCE")
    private String source;
    /**
     * 账号类型：1=个人账号；2=公司账号
     */
    @TableField("ACCOUNT_TYPE")
    private String accountType;
    /**
     * 公司类型：1=普通公司；2=合作机构
     */
    @TableField("COMPANY_TYPE")
    private String companyType;
    /**
     * 电话号码
     */
    @TableField("PHONE")
    private String phone;
    /**
     * 手机号码
     */
    @TableField("MOBILE")
    private String mobile;
    /**
     * 电子邮件
     */
    @TableField("EMAIL")
    private String email;
    /**
     * 微信
     */
    @TableField("WEIXIN")
    private String weixin;
    /**
     * 腾讯QQ
     */
    @TableField("QQ")
    private String qq;
    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 扩展信息
     */
    @TableField("INFO")
    private String info;

    /**
     * 状态：1=启用/0=禁用
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


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
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
        return this.userId; 
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
