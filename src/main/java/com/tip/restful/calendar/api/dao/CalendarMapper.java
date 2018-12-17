package com.tip.restful.calendar.api.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tip.restful.calendar.api.entity.Calendar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  个人日历
 *  数据访问层
 * @author 庞亦华
 * @since 2018-9-26
 * @version 0.1
 */
public interface CalendarMapper extends BaseMapper<Calendar> {
    /**
     *  根据用户id和起止时间获取所有任务的唯一日期
     * @param userId
     * @param beginDate
     * @param endDate
     * @return
     */
    List<String>  getTaskDateInMonth(@Param("userId") String userId , @Param("beginDate") String beginDate ,@Param("endDate") String endDate);
}