package com.tip.restful.manager.api.dao;

import com.tip.restful.manager.api.entity.SysFeedbackRate;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-09-18
 */
public interface SysFeedbackRateMapper extends BaseMapper<SysFeedbackRate> {
    /**
     * 获取指定模块的平均分值
     * @param modulePath
     * @return 平均值（四舍五入后整数）
     */
    int getMeanValueOfModuleRate(String modulePath);

}
