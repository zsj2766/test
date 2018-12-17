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
 * 用户角色关系表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_USER_ROLE")
public class SysUserRole extends ModelBase<SysUserRole> implements IModelCreator {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId("USER_ROLE_ID")
    private String userRoleId;
    /**
     *
     */
    @TableField("ROLE_ID")
    private String roleId;
    /**
     *
     */
    @TableField("USER_ID")
    private String userId;
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

    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    @TableField(exist = false)
    private String positionType;
    @TableField(exist = false)
    private String workDeptName;
    @TableField(exist = false)
    private String job;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWorkDeptName() {
        return workDeptName;
    }

    public void setWorkDeptName(String workDeptName) {
        this.workDeptName = workDeptName;
    }


    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    protected Serializable pkVal() {
        return this.userRoleId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
