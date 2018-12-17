package com.tip.restful.calendar.api.service;


import com.tip.restful.calendar.api.entity.Calendar;
import com.tip.restful.core.service.IServiceBase;

import java.util.Date;
import java.util.List;

/**
 * 个人日历服务接口
 * @author 庞亦华
 * @since 2018-9-26
 * @version 0.1
 */

public interface ICalendarService extends IServiceBase<Calendar> {
    Calendar  addTask(String userId, Date taskDate , String Content);
    List<String> getTaskDateInMonth(String userId , String year , String month);
    boolean doneCalendarTask(String calendarId , boolean dongFlag);
    boolean deleteCalendarTask(String calendarId);

}
