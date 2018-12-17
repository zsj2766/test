package com.tip.restful.manager.api.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tip.restful.core.entity.ModelBase;

import com.tip.restful.core.entity.IModelModifyer;
import com.tip.restful.core.entity.IModelCreator;

/**
 * <p>
 * 内部用户信息表
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@TableName("SYS_USER")
public class SysUser extends ModelBase<SysUser> implements IModelCreator, IModelModifyer {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId("USER_ID")
    private String userId;
    /**
     *
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     *
     */
    @TableField("ACCOUNT")
    private String account;

    /**
     *
     */
    @TableField("WORK_DEPT_ID")
    private String workDeptId;
    /**
     *
     */
    @TableField("WORK_DEPT_NAME")
    private String workDeptName;
    /**
     *
     */
    @TableField("WORK_DEPT_CODE")
    private String workDeptCode;
    /**
     *
     */
    @TableField("COMPILE_DEPT_ID")
    private String compileDeptId;
    /**
     *
     */
    @TableField("COMPILE_DEPT_NAME")
    private String compileDeptName;
    /**
     *
     */
    @TableField("COMPILE_DEPT_CODE")
    private String compileDeptCode;
    /**
     *
     */
    @TableField("POSITION")
    private String position;
    /**
     *
     */
    @TableField("JOB")
    private String job;
    /**
     *
     */
    @TableField("PROVINCE_ID")
    private String provinceId;
    /**
     *
     */
    @TableField("PROVINCE_NAME")
    private String provinceName;
    /**
     *
     */
    @TableField("CITY_ID")
    private String cityId;
    /**
     *
     */
    @TableField("CITY_NAME")
    private String cityName;
    /**
     *
     */
    @TableField("VILLAGE_ID")
    private String villageId;
    /**
     *
     */
    @TableField("VILLAGE_NAME")
    private String villageName;
    /**
     *
     */
    @TableField("ADDR")
    private String addr;
    /**
     * 1=是/0=否
     */
    @TableField("IS_SUPER_ADMIN")
    private int isSuperAdmin;
    /**
     * 临时用户/永久用户
     */
    @TableField("USER_TYPE")
    private String userType;
    /**
     *
     */
    @TableField("START_DATE")
    private Date startDate;
    /**
     *
     */
    @TableField("END_DATE")
    private Date endDate;
    /**
     *
     */
    @TableField("EXT_ATTR")
    private String extAttr;
    /**
     *
     */
    @TableField("OA_ID")
    private int oaId;
    /**
     *
     */
    @TableField("SUPERIOR")
    private int superior;
    /**
     *
     */
    @TableField("SUPERIOR_ID")
    private String superiorId;
    /**
     *
     */
    @TableField("SUPERIOR_NAME")
    private String superiorName;
    /**
     *
     */
    @TableField("ID_CARD_NO")
    private String idCardNo;
    /**
     *
     */
    @TableField("POSITION_TYPE")
    private String positionType;
    /**
     *
     */
    @TableField("EPMPLAYEE")
    private String epmplayee;
    /**
     *
     */
    @TableField("PRIVATE_KEY")
    private String privateKey;

    /**
     *
     */
    @TableField("MOBILE")
    private String mobile;
    /**
     *
     */
    @TableField("EMAIL")
    private String email;
    /**
     *
     */
    @TableField("WEIXIN")
    private String weixin;
    /**
     *
     */
    @TableField("QQ")
    private String qq;

    /**
     * 排序号：对应OA POS
     */
    @TableField("ORDER_NO")
    private int orderNo;
    /**
     *
     */
    @TableField("REMARK")
    private String remark;
    /**
     * 启用/禁用：对应OA STATE
     */
    @TableField("STATE")
    private int state;
    /**
     *
     */
    @TableField("CREATOR_ID")
    private String creatorId;
    /**
     *
     */
    @TableField("CREATOR_NAME")
    private String creatorName;
    /**
     *
     */
    @TableField("CREATE_DATE")
    private Date createDate;
    /**
     *
     */
    @TableField("MODIFIER_ID")
    private String modifierId;
    /**
     *
     */
    @TableField("MODIFIER_NAME")
    private String modifierName;
    /**
     *
     */
    @TableField("MODIFY_DATE")
    private Date modifyDate;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getWorkDeptId() {
        return workDeptId;
    }

    public void setWorkDeptId(String workDeptId) {
        this.workDeptId = workDeptId;
    }

    public String getWorkDeptName() {
        return workDeptName;
    }

    public void setWorkDeptName(String workDeptName) {
        this.workDeptName = workDeptName;
    }

    public String getWorkDeptCode() {
        return workDeptCode;
    }

    public void setWorkDeptCode(String workDeptCode) {
        this.workDeptCode = workDeptCode;
    }

    public String getCompileDeptId() {
        return compileDeptId;
    }

    public void setCompileDeptId(String compileDeptId) {
        this.compileDeptId = compileDeptId;
    }

    public String getCompileDeptName() {
        return compileDeptName;
    }

    public void setCompileDeptName(String compileDeptName) {
        this.compileDeptName = compileDeptName;
    }

    public String getCompileDeptCode() {
        return compileDeptCode;
    }

    public void setCompileDeptCode(String compileDeptCode) {
        this.compileDeptCode = compileDeptCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(int isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getExtAttr() {
        return extAttr;
    }

    public void setExtAttr(String extAttr) {
        this.extAttr = extAttr;
    }

    public int getOaId() {
        return oaId;
    }

    public void setOaId(int oaId) {
        this.oaId = oaId;
    }

    public int getSuperior() {
        return superior;
    }

    public void setSuperior(int superior) {
        this.superior = superior;
    }

    public String getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(String superiorId) {
        this.superiorId = superiorId;
    }

    public String getSuperiorName() {
        return superiorName;
    }

    public void setSuperiorName(String superiorName) {
        this.superiorName = superiorName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getEpmplayee() {
        return epmplayee;
    }

    public void setEpmplayee(String epmplayee) {
        this.epmplayee = epmplayee;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String getCreatorId() {
        return creatorId;
    }

    @Override
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public String getCreatorName() {
        return creatorName;
    }

    @Override
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String getModifierId() {
        return modifierId;
    }

    @Override
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public String getModifierName() {
        return modifierName;
    }

    @Override
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    @Override
    public Date getModifyDate() {
        return modifyDate;
    }

    @Override
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
