package com.tip.restful.dealPublish.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tip.restful.core.entity.ModelBase;

import java.io.Serializable;

@TableName("ef_bn_apply_number")
public class ApplyNumber extends ModelBase<ApplyNumber> implements Serializable {
  @TableId("APPLY_ID")
  private String applyId;

  @TableField("COMPANY_NAME")
  private String companyName;

  @TableField("COMPANY_TYPE")
  private String companyType;

  @TableField("COMPANY_ATTR")
  private String companyAttr;

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

  @TableField("IS_RECOMMEND")
  private boolean isRecommend;

  @TableField("AUDIT_SITUATION")
  private boolean auditSituation;

  private static final long serialVersionUID = 1L;

  public String getApplyId() {
    return applyId;
  }

  public void setApplyId(String applyId) {
    this.applyId = applyId == null ? null : applyId.trim();
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName == null ? null : companyName.trim();
  }

  public String getCompanyType() {
    return companyType;
  }

  public void setCompanyType(String companyType) {
    this.companyType = companyType == null ? null : companyType.trim();
  }

  public String getCompanyAttr() {
    return companyAttr;
  }

  public void setCompanyAttr(String companyAttr) {
    this.companyAttr = companyAttr == null ? null : companyAttr.trim();
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area == null ? null : area.trim();
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

  public boolean isRecommend() {
    return isRecommend;
  }

  public void setRecommend(boolean recommend) {
    isRecommend = recommend;
  }

  public boolean isAuditSituation() {
    return auditSituation;
  }

  public void setAuditSituation(boolean auditSituation) {
    this.auditSituation = auditSituation;
  }

  @Override
  protected Serializable pkVal() {
    return this.applyId;
  }
}
