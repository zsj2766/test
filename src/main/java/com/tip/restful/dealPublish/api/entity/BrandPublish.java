package com.tip.restful.dealPublish.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tip.restful.core.entity.ModelBase;

import java.io.Serializable;
import java.util.List;

@TableName("ef_bn_brand_publish")
public class BrandPublish extends ModelBase<BrandPublish> implements Serializable {
  @TableId("PUBLISH_ID")
  private String publishId;

  @TableField("COMPANY_NAME")
  private String companyName;

  private String companyType;

  private String companyAttr;

  private String lastApplyNumber;

  @TableField("AREA")
  private String area;

  @TableField("EXHIBITION_SESSION")
  private String exhibitionSession;

  @TableField("EXHIBITION_AREA")
  private String exhibitionArea;

  @TableField("APPLY_NUMBER")
  private String applyNumber;

  @TableField("CBCF_CODE")
  private String cbcfCode;

  @TableField("DEAL_NAME")
  private String dealName;

  private List<ApplyNumber> applyNumbers;

  private DealGrade dealGrade;

  private static final long serialVersionUID = 1L;

  public String getPublishId() {
    return publishId;
  }

  public void setPublishId(String publishId) {
    this.publishId = publishId == null ? null : publishId.trim();
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName == null ? null : companyName.trim();
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area == null ? null : area.trim();
  }

  public String getCompanyType() {
    return companyType;
  }

  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }

  public String getCompanyAttr() {
    return companyAttr;
  }

  public void setCompanyAttr(String companyAttr) {
    this.companyAttr = companyAttr;
  }

  public String getLastApplyNumber() {
    return lastApplyNumber;
  }

  public void setLastApplyNumber(String lastApplyNumber) {
    this.lastApplyNumber = lastApplyNumber;
  }

  public String getExhibitionSession() {
    return exhibitionSession;
  }

  public void setExhibitionSession(String exhibitionSession) {
    this.exhibitionSession = exhibitionSession == null ? null : exhibitionSession.trim();
  }

  public String getExhibitionArea() {
    return exhibitionArea;
  }

  public void setExhibitionArea(String exhibitionArea) {
    this.exhibitionArea = exhibitionArea == null ? null : exhibitionArea.trim();
  }

  public String getApplyNumber() {
    return applyNumber;
  }

  public void setApplyNumber(String applyNumber) {
    this.applyNumber = applyNumber == null ? null : applyNumber.trim();
  }

  public String getCbcfCode() {
    return cbcfCode;
  }

  public void setCbcfCode(String cbcfCode) {
    this.cbcfCode = cbcfCode == null ? null : cbcfCode.trim();
  }

  public String getDealName() {
    return dealName;
  }

  public void setDealName(String dealName) {
    this.dealName = dealName == null ? null : dealName.trim();
  }

  public List<ApplyNumber> getApplyNumbers() {
    return applyNumbers;
  }

  public void setApplyNumbers(List<ApplyNumber> applyNumbers) {
    this.applyNumbers = applyNumbers;
  }

  public DealGrade getDealGrade() {
    return dealGrade;
  }

  public void setDealGrade(DealGrade dealGrade) {
    this.dealGrade = dealGrade;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", publishId=").append(publishId);
    sb.append(", companyName=").append(companyName);
    sb.append(", area=").append(area);
    sb.append(", exhibitionSession=").append(exhibitionSession);
    sb.append(", exhibitionArea=").append(exhibitionArea);
    sb.append(", applyNumber=").append(applyNumber);
    sb.append(", cbcfCode=").append(cbcfCode);
    sb.append(", dealName=").append(dealName);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }

  @Override
  protected Serializable pkVal() {
    return this.publishId;
  }
}
