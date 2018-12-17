package com.tip.restful.dealPublish.api.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tip.restful.dealPublish.api.entity.ApplyNumber;

import java.util.List;

public interface EfBnApplyNumberMapper extends BaseMapper<ApplyNumber> {

  int insertApply(ApplyNumber record);

  ApplyNumber selectByApplyId(String applyId);

  List<ApplyNumber> selectAll();

  int updateByName(ApplyNumber record);
}
