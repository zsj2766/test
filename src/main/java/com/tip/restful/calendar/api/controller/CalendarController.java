package com.tip.restful.calendar.api.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.tip.restful.calendar.api.dao.CalendarMapper;
import com.tip.restful.calendar.api.entity.Calendar;
import com.tip.restful.calendar.api.service.impl.CalendarServiceImpl;
import com.tip.restful.core.controller.TControllerBase;
import com.tip.restful.core.controller.result.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 个人日历管理控制器
 *
 * @author 庞亦华
 * @version 0.1
 * @since 2018-9-26
 */
@RestController
@RequestMapping("/v2/calendar")
public class CalendarController  extends TControllerBase<Calendar, CalendarServiceImpl> {

    @ApiOperation("新增一个任务")
    @RequestMapping(value={"addTask"},method = {RequestMethod.POST})
    public JsonResult<?> addTask(String userId , String taskDate , String content)  {
        if(StringUtils.isEmpty(userId))  return this.ResultToJson(false,"必须有人，有ID");
        if(StringUtils.isEmpty(taskDate))  return this.ResultToJson(false,"必须有时间");
        if(StringUtils.isEmpty(content))  return this.ResultToJson(false,"必须有内容，无内容无真像");
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        Date dTaskDate = null;
        try {
            dTaskDate = dateFormat.parse(taskDate);
        }catch (ParseException e){
            return this.ResultToJson(false,e.getMessage());
        }
        // boolean flag = baseService.addTask(userId, dTaskDate, content);
        return this.ResultToJson(baseService.addTask(userId, dTaskDate, content));
    }

    @ApiOperation("获取某用户某月或某天的所有任务")
    @RequestMapping(value={"getMonthTask"},method = {RequestMethod.POST})
    public JsonResult<?> getMonthTask(String userId, String queryDate){
        if(StringUtils.isEmpty(userId))  return this.ResultToJson(false,"必须有人，有ID");
        if(StringUtils.isEmpty(queryDate))  return this.ResultToJson(false,"必须设置日期");
        List<Calendar> list = new ArrayList<Calendar>();
        EntityWrapper<Calendar> ew = new EntityWrapper<Calendar>();
        if(queryDate.length() < 8){
            // 按照月份查询
            ew.where("user_id = {0} and task_date between {1} and {2}" , userId, queryDate+"/01", queryDate + "/31");
        } else {
            // 按具体哪天查询
            ew.where("user_id = {0} and task_date = {1}", userId, queryDate );
        }
        list = baseService.selectList(ew);
        return this.ResultToJson(list);
    }

    @ApiOperation("获取某月有任务的日期")
    @RequestMapping(value={"getTaskDateInMonth"},method = {RequestMethod.POST})
    public JsonResult<?> getTaskDateInMonth(String userId, String taskYear, String taskMonth){
        if(StringUtils.isEmpty(userId))  return this.ResultToJson(false,"必须有人，有ID");
        if(StringUtils.isEmpty(taskYear))  return this.ResultToJson(false,"必须设置年份");
        if(StringUtils.isEmpty(taskMonth))  return this.ResultToJson(false,"必须设置月份");

        List<String> list = baseService.getTaskDateInMonth(userId,taskYear,taskMonth);
        return ObjResultToJson(list);
    }

    @ApiOperation("指定任务已经完成")
    @RequestMapping(value={"doneCalendarTask"},method = {RequestMethod.POST})
    public JsonResult<?> doneCalendarTask(String userId , String calendarId , boolean doneFlag){
        boolean flag = baseService.doneCalendarTask(calendarId, doneFlag);
        return this.ResultToJson(flag);
    }

    @ApiOperation("删除指定任务")
    @RequestMapping(value={"deleteCalendarTask"},method = {RequestMethod.POST})
    public JsonResult<?> deleteCalendarTask(String userId, String calendarId){
        boolean flag = baseService.deleteCalendarTask(calendarId);
        return this.ResultToJson(flag);
    }



}
