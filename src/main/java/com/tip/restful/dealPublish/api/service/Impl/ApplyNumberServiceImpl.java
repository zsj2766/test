package com.tip.restful.dealPublish.api.service.Impl;

import com.tip.restful.core.service.ServiceBaseImpl;
import com.tip.restful.dealPublish.api.dao.EfBnApplyNumberMapper;
import com.tip.restful.dealPublish.api.entity.ApplyNumber;
import com.tip.restful.dealPublish.api.service.IApplyNumberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplyNumberServiceImpl extends ServiceBaseImpl<EfBnApplyNumberMapper, ApplyNumber>
    implements IApplyNumberService {

  @Resource private EfBnApplyNumberMapper ApplyNumberMapper;

  @Override
  public int insertApply(ApplyNumber record) {
    return ApplyNumberMapper.insertApply(record);
  }

  @Override
  public ApplyNumber selectByName(String applyId) {
    return ApplyNumberMapper.selectByApplyId(applyId);
  }

  @Override
  public List<ApplyNumber> selectAll() {
    return ApplyNumberMapper.selectAll();
  }

  @Override
  public int updateByName(ApplyNumber record) {
    return ApplyNumberMapper.updateByName(record);
  }
}
