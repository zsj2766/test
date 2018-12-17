package com.tip.restful.dealPublish.api.dao;

import com.tip.restful.dealPublish.api.entity.ApplyNumber;
import com.tip.restful.dealPublish.api.entity.BrandPublish;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EfBnBrandPublishMapper {

  int insert(ApplyNumber record);

    List<BrandPublish> selectByConditions(
      @Param("exhibitionSession") String exhibitionSession,
      @Param("exhibitionArea") String exhibitionArea,
      @Param("isrecommend") String isrecommend);
}
