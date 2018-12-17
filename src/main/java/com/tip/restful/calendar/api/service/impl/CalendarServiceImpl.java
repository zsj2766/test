package com.tip.restful.calendar.api.service.impl;


import com.tip.restful.calendar.api.dao.CalendarMapper;
import com.tip.restful.calendar.api.entity.Calendar;
import com.tip.restful.calendar.api.service.ICalendarService;
import com.tip.restful.core.service.ServiceBaseImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 庞亦华
 * @since 2018-9-26
 */
@Service
public class CalendarServiceImpl extends ServiceBaseImpl<CalendarMapper, Calendar> implements ICalendarService {

    // 增加一个日历任务
    @Override
    public Calendar addTask(String userId, Date taskDate , String content) {
       Calendar calendar = new Calendar();
       calendar.setCalendarId(java.util.UUID.randomUUID().toString().replaceAll("-",""));
       calendar.setUserId(userId);
       calendar.setTaskDate(taskDate);
       calendar.setContent(content);
       baseMapper.insert(calendar);
       return calendar;
   }

   // 获取指定月份所有有任务的日期
   @Override
    public List<String> getTaskDateInMonth(String userId , String year , String month){
        String beginDate = year +"/" + month + "/01";
        String endDate =  year +"/" + month + "/31";
        List<String> list = baseMapper.getTaskDateInMonth(userId, beginDate , endDate);
        return list;
    }

    // 设置指定任务已经完成
    @Override
    public boolean doneCalendarTask(String calendarId , boolean doneFlag){
        int iFlag = 0;
        Calendar calendar = new Calendar();
        if ( doneFlag == true) {
            iFlag = 1;
        }else{
            iFlag = 0;
        }
        calendar = super.selectById(calendarId);
        calendar.setDone(iFlag);
        boolean flag = super.updateById(calendar);
        return flag;
    }

    // 删除指定的任务
    @Override
    public boolean deleteCalendarTask(String calendarId){
        boolean flag = super.deleteById(calendarId);
        return flag;
    }

}
