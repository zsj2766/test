package com.tip.restful.dealPublish.api.service.Impl;

import com.tip.restful.dealPublish.api.dao.EfBnBrandPublishMapper;
import com.tip.restful.dealPublish.api.entity.ApplyNumber;
import com.tip.restful.dealPublish.api.entity.BrandPublish;
import com.tip.restful.dealPublish.api.service.IBrandPublishService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandPublishServiceImpl implements IBrandPublishService {
  @Resource private EfBnBrandPublishMapper brandPublishMapper;

  @Override
  public int insert(ApplyNumber record) {
    return brandPublishMapper.insert(record);
  }

  @Override
  public List<BrandPublish> selectByConditions(
      String exhibitionSession, String exhibitionArea, String isrecommend) {
    return brandPublishMapper.selectByConditions(exhibitionSession, exhibitionArea, isrecommend);
  }
}
