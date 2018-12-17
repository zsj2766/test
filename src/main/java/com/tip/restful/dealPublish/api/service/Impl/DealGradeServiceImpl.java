package com.tip.restful.dealPublish.api.service.Impl;

import com.tip.restful.dealPublish.api.constant.MarkConstant;
import com.tip.restful.dealPublish.api.dao.EfBnDealGradeMapper;
import com.tip.restful.dealPublish.api.entity.DealGrade;
import com.tip.restful.dealPublish.api.service.IDealGradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DealGradeServiceImpl implements IDealGradeService {

  @Resource private EfBnDealGradeMapper dealGradeMapper;

  @Override
  public int insert(DealGrade record) {
    dealMark(record);
    return dealGradeMapper.insert(record);
  }

  @Override
  public String selectByName(String companyName) {
    return dealGradeMapper.selectByApplyId(companyName);
  }

  private void dealMark(DealGrade record) {
    if (record.getBrandMark() >= MarkConstant.MAX_BRANDMARK) {
      record.setBrandMark(MarkConstant.MAX_BRANDMARK);
    }
    if (record.getExportMark() >= MarkConstant.MAX_EXPORTMARK) {
      record.setExportMark(MarkConstant.MAX_EXPORTMARK);
    }
    if (record.getIndustryDisciplineMark() >= MarkConstant.MAX_INDUSTRYDISCIPLINEMARK) {
      record.setIndustryDisciplineMark(MarkConstant.MAX_INDUSTRYDISCIPLINEMARK);
    }
    if (record.getPatentCopyrightMark() >= MarkConstant.MAX_PATENTCOPYRIGHTMARK) {
      record.setPatentCopyrightMark(MarkConstant.MAX_PATENTCOPYRIGHTMARK);
    }
    if (record.getIndustryStandardMark() >= MarkConstant.MAX_INDUSTRYSTANDARDMARK) {
      record.setIndustryStandardMark(MarkConstant.MAX_INDUSTRYSTANDARDMARK);
    }
    if (record.getHighTechMark() >= MarkConstant.MAX_HIGHTECHMARK) {
      record.setHighTechMark(MarkConstant.MAX_HIGHTECHMARK);
    }
    if (record.getQualityEnvManaMark()
            + record.getProductsIndustryMark()
            + record.getIndustryCertificationMark()
        >= MarkConstant.MAX_INTERNATIONALPROJECT) {
      record.setInternationalProjectMark(MarkConstant.MAX_INTERNATIONALPROJECT);
    } else {
      record.setInternationalProjectMark(
          record.getQualityEnvManaMark()
              + record.getProductsIndustryMark()
              + record.getIndustryCertificationMark());
    }
    if (record.getOverseaTrademarkMark() + record.getDomesticTrademarkMark()
        >= MarkConstant.MAX_TRADEMARKMARK) {
      record.setTrademarkMark(MarkConstant.MAX_TRADEMARKMARK);
    } else {
      record.setTrademarkMark(record.getOverseaTrademarkMark() + record.getDomesticTrademarkMark());
    }
    record.setDealMark(
        record.getBrandMark()
            + record.getExportMark()
            + record.getIndustryDisciplineMark()
            + record.getPatentCopyrightMark()
            + record.getIndustryStandardMark()
            + record.getHighTechMark()
            + record.getInternationalProjectMark()
            + record.getTrademarkMark());
  }
}
