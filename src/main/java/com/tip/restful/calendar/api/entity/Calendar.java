package com.tip.restful.calendar.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tip.restful.core.entity.IModelCreator;
import com.tip.restful.core.entity.ModelBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * 个人日历管理
 *
 * @author 庞亦华
 * @version 0.1 个人日历
 * @since 2018-10-19
 */

@ApiModel("日历")
@TableName("calendar")
public class Calendar extends ModelBase<Calendar> implements IModelCreator {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("日历主键，GUID")
    @TableId("calendar_id")
    private String calendarId;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private String userId;


    @ApiModelProperty("任务日期")
    @TableField("task_date")
    private Date taskDate;

    @ApiModelProperty("任务内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("是否完成")
    @TableField("done")
    private int done;

    @ApiModelProperty("创建人ID")
    @TableField("creator_id")
    private String creatorId;

    @ApiModelProperty("创建人姓名")
    @TableField("creator_name")
    private String creatorName;

    @ApiModelProperty("创建日期")
    @TableField("create_date")
    private Date createDate;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public int getDone() { return done; }

    public void setDone(int done) { this.done = done; }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.calendarId;
    }


}
