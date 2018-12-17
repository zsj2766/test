package com.tip.restful.dealPublish.api.service;

import com.tip.restful.dealPublish.api.entity.ApplyNumber;
import com.tip.restful.dealPublish.api.entity.BrandPublish;

import java.util.List;

public interface IBrandPublishService {

  int insert(ApplyNumber record);

  List<BrandPublish> selectByConditions(
      String exhibitionSession, String exhibitionArea, String isrecommend);
}
