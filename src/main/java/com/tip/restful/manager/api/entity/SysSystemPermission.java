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
 * 用户系统权限信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-31
 */
@TableName("SYS_SYSTEM_PERMISSION")
public class SysSystemPermission extends ModelBase<SysSystemPermission> implements IModelCreator {

    private static final long serialVersionUID = 1L;

    /**
     * 系统权限ID
     */
    @TableId("SYSTEM_PERMISSION_ID")
    private String systemPermissionId;
    /**
     * 用户ID
     */
    @TableField("USER_ID")
    private String userId;
    /**
     * 系统ID
     */
    @TableField("SYSTEM_ID")
    private String systemId;
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


    public String getSystemPermissionId() {
        return systemPermissionId;
    }

    public void setSystemPermissionId(String systemPermissionId) {
        this.systemPermissionId = systemPermissionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
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
        return this.systemPermissionId; 
    }
}
