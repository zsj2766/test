package com.tip.restful.dealPublish.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tip.restful.core.entity.ModelBase;

import java.io.Serializable;

@TableName("ef_bn_deal_grade")
public class DealGrade extends ModelBase<DealGrade> implements Serializable {
  @TableId("DEAL_ID")
  private String dealId;

  @TableField("APPLY_ID")
  private String applyId;

  @TableField("EXPORT_PROPORTION")
  private String exportProportion;

  @TableField("EXPORT_MARK")
  private int exportMark;

  @TableField("DEAL_MARK")
  private int dealMark;

  @TableField("BRAND_MARK")
  private int brandMark;

  @TableField("INDUSTRY_DISCIPLINE_MARK")
  private int industryDisciplineMark;

  @TableField("PATENT_COPYRIGHT_MARK")
  private int patentCopyrightMark;

  @TableField("HIGH_TECH_MARK")
  private int highTechMark;

  @TableField("INDUSTRY_STANDARD_MARK")
  private int industryStandardMark;

  @TableField("QUALITY_ENV_MANA_MARK")
  private int qualityEnvManaMark;

  @TableField("INDUSTRY_CERTIFICATION_MARK")
  private int industryCertificationMark;

  @TableField("PRODUCTS_INDUSTRY_MARK")
  private int productsIndustryMark;

  @TableField("DOMESTIC_TRADEMARK_MARK")
  private int domesticTrademarkMark;

  @TableField("OVERSEA_TRADEMARK_MARK")
  private int overseaTrademarkMark;

  @TableField("IS_STANDARD")
  private boolean isStandard;

  private int internationalProjectMark;

  private int trademarkMark;

  private static final long serialVersionUID = 1L;

  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }

  public String getApplyId() {
    return applyId;
  }

  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }

  public String getExportProportion() {
    return exportProportion;
  }

  public void setExportProportion(String exportProportion) {
    this.exportProportion = exportProportion;
  }

  public int getExportMark() {
    return exportMark;
  }

  public void setExportMark(int exportMark) {
    this.exportMark = exportMark;
  }

  public int getDealMark() {
    return dealMark;
  }

  public void setDealMark(int dealMark) {
    this.dealMark = dealMark;
  }

  public int getIndustryDisciplineMark() {
    return industryDisciplineMark;
  }

  public void setIndustryDisciplineMark(int industryDisciplineMark) {
    this.industryDisciplineMark = industryDisciplineMark;
  }

  public int getBrandMark() {
    return brandMark;
  }

  public void setBrandMark(int brandMark) {
    this.brandMark = brandMark;
  }

  public int getPatentCopyrightMark() {
    return patentCopyrightMark;
  }

  public void setPatentCopyrightMark(int patentCopyrightMark) {
    this.patentCopyrightMark = patentCopyrightMark;
  }

  public int getHighTechMark() {
    return highTechMark;
  }

  public void setHighTechMark(int highTechMark) {
    this.highTechMark = highTechMark;
  }

  public int getIndustryStandardMark() {
    return industryStandardMark;
  }

  public void setIndustryStandardMark(int industryStandardMark) {
    this.industryStandardMark = industryStandardMark;
  }

  public int getQualityEnvManaMark() {
    return qualityEnvManaMark;
  }

  public void setQualityEnvManaMark(int qualityEnvManaMark) {
    this.qualityEnvManaMark = qualityEnvManaMark;
  }

  public int getIndustryCertificationMark() {
    return industryCertificationMark;
  }

  public void setIndustryCertificationMark(int industryCertificationMark) {
    this.industryCertificationMark = industryCertificationMark;
  }

  public int getProductsIndustryMark() {
    return productsIndustryMark;
  }

  public void setProductsIndustryMark(int productsIndustryMark) {
    this.productsIndustryMark = productsIndustryMark;
  }

  public int getDomesticTrademarkMark() {
    return domesticTrademarkMark;
  }

  public void setDomesticTrademarkMark(int domesticTrademarkMark) {
    this.domesticTrademarkMark = domesticTrademarkMark;
  }

  public int getOverseaTrademarkMark() {
    return overseaTrademarkMark;
  }

  public void setOverseaTrademarkMark(int overseaTrademarkMark) {
    this.overseaTrademarkMark = overseaTrademarkMark;
  }

  public boolean isStandard() {
    return isStandard;
  }

  public void setStandard(boolean standard) {
    isStandard = standard;
  }

  public int getInternationalProjectMark() {
    return internationalProjectMark;
  }

  public void setInternationalProjectMark(int internationalProjectMark) {
    this.internationalProjectMark = internationalProjectMark;
  }

  public int getTrademarkMark() {
    return trademarkMark;
  }

  public void setTrademarkMark(int trademarkMark) {
    this.trademarkMark = trademarkMark;
  }

  @Override
  protected Serializable pkVal() {
    return this.dealId;
  }
}
