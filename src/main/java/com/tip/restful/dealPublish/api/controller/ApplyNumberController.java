package com.tip.restful.dealPublish.api.controller;

import com.alibaba.fastjson.JSON;
import com.tip.restful.dealPublish.api.entity.ApplyNumber;
import com.tip.restful.dealPublish.api.entity.BrandPublish;
import com.tip.restful.dealPublish.api.entity.DealGrade;
import com.tip.restful.dealPublish.api.service.IApplyNumberService;
import com.tip.restful.dealPublish.api.service.IBrandPublishService;
import com.tip.restful.dealPublish.api.service.IDealGradeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/applyNumber")
public class ApplyNumberController {

  @Resource private IApplyNumberService applyNumberService;

  @Resource private IDealGradeService dealGradeService;

  @Resource private IBrandPublishService brandPublishService;

  @RequestMapping(value = {"/add"})
  public void add(ApplyNumber applyNumber) {
    applyNumberService.insertApply(applyNumber);
  }

  @RequestMapping(value = {"/mark/{applyId}"})
  public String mark(@PathVariable("applyId") String applyId, DealGrade dealGrade) {
    ApplyNumber applyNumber = applyNumberService.selectByName(applyId);
    if (applyNumber != null) {
      dealGradeService.insert(dealGrade);
      applyNumberService.updateByName(applyNumber);
      brandPublishService.insert(applyNumber);
    }
    return JSON.toJSONString(dealGrade);
  }

  @RequestMapping(value = {"/getlist"})
  public String getList(@RequestParam("exhibitionSession") String exhibitionSession) {
    List<BrandPublish> list =
        brandPublishService.selectByConditions(exhibitionSession, null, null);
    return JSON.toJSONString(list);
  }
}
