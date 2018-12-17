package com.tip.restful.manager.api.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tip.restful.core.common.helper.JSONHelper;
import com.tip.restful.core.controller.param.form.FormParam;
import com.tip.restful.core.controller.param.query.QueryParam;
import com.tip.restful.manager.api.entity.SysFeedbackRate;
import com.tip.restful.manager.api.entity.SysMenu;
import com.tip.restful.manager.api.service.ISysFeedbackRateService;
import com.tip.restful.manager.api.service.impl.SysDataDictItemServiceImpl;
import com.tip.restful.manager.api.service.impl.SysFeedbackRateServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import com.tip.restful.core.controller.ControllerBase;
import com.tip.restful.core.controller.result.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-09-18
 */
@RestController
@RequestMapping("/api/sysFeedbackRate")
public class SysFeedbackRateController extends ControllerBase<SysFeedbackRate, ISysFeedbackRateService> {
    @Autowired
    ISysFeedbackRateService iRateService;
    SysFeedbackRate sysFeedbackRate;

    @ApiOperation("模块评价")
    @RequestMapping(value = "/module/rate",method = RequestMethod.POST)
    public JsonResult<?> moduleRate(@RequestBody SysFeedbackRate rate){
        iRateService.insert(rate);
        Integer meanValue = iRateService.getMeanValueOfModuleRate(rate.getModulePath());
        Map<String, Integer> maps = new HashMap<>();
        maps.put("meanvalue",meanValue);
        return ObjResultToJson(maps);
    }

    @ApiOperation("通用获取分页记录列表方法")
    @RequestMapping(
            value = {"getListPage"},
            method = {RequestMethod.GET}
    )
    @Override
    public JsonResult<?> getListPage(String json) {
        QueryParam<SysFeedbackRate> queryData = QueryParam.parseQueryData(json, this, this.entityClazz);
        this.CustomQueryParams(queryData);
        Page<SysFeedbackRate> page = this.baseService.selectPage(queryData.getPage(), queryData.getEw());
        return this.ResultToJson(page);
    }


}
