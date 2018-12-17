package com.tip.restful.manager.api.service;

import com.tip.restful.manager.api.entity.SysFeedbackRate;
import com.tip.restful.core.service.IServiceBase;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-09-18
 */
public interface ISysFeedbackRateService extends IServiceBase<SysFeedbackRate> {
    int getMeanValueOfModuleRate(String modulePath);

}
