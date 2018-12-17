package com.tip.restful.dealPublish.api.service;

import com.tip.restful.core.service.IServiceBase;
import com.tip.restful.dealPublish.api.entity.ApplyNumber;

import java.util.List;

public interface IApplyNumberService extends IServiceBase<ApplyNumber> {

  int insertApply(ApplyNumber record);


  ApplyNumber selectByName(String applyId);

  List<ApplyNumber> selectAll();

  int updateByName(ApplyNumber record);
}
