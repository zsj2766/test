package com.tip.restful.manager.api.service;

import com.tip.restful.manager.api.entity.SysUser;
import com.tip.restful.core.service.IServiceBase;

/**
 * <p>
 * 内部用户信息表 服务类
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
public interface ISysUserService extends IServiceBase<SysUser> {
    boolean resetPwd(String userId, String account, String newPwd);
}
