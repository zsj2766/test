package com.tip.restful.manager.api.service.impl;

import com.tip.restful.core.service.ServiceBaseImpl;
import com.tip.restful.manager.api.dao.SysFeedbackRateMapper;
import com.tip.restful.manager.api.entity.SysFeedbackRate;
import com.tip.restful.manager.api.service.ISysFeedbackRateService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-09-18
 */
@Service
public class SysFeedbackRateServiceImpl extends ServiceBaseImpl<SysFeedbackRateMapper, SysFeedbackRate> implements ISysFeedbackRateService {

    public int getMeanValueOfModuleRate(String modulePath) {
        return baseMapper.getMeanValueOfModuleRate(modulePath);
    }

}
