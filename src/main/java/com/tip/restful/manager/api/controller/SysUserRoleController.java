package com.tip.restful.manager.api.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.tip.restful.core.controller.param.query.QueryParam;
import com.tip.restful.core.controller.result.JsonResult;
import com.tip.restful.manager.api.entity.SysUser;
import com.tip.restful.manager.api.entity.SysUserRole;
import com.tip.restful.manager.api.service.ISysUserRoleService;
import com.tip.restful.manager.api.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tip.restful.core.controller.ControllerBase;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户角色关系表 前端控制器
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@RestController
@RequestMapping("/api/sysUserRole")
public class SysUserRoleController extends ControllerBase<SysUserRole, ISysUserRoleService> {


    @Autowired
    ISysUserService userService;

    @Override
    public JsonResult<?> getListPage(String json) {
        QueryParam<SysUserRole> queryData = QueryParam.parseQueryData(json, this, this.entityClazz);
        this.CustomQueryParams(queryData);
        Page<SysUserRole> page = this.baseService.selectPage(queryData.getPage(), queryData.getEw());
        List<String> userIds = new ArrayList<String>();
        for (SysUserRole userRole : page.getRecords()) {
            userIds.add(userRole.getUserId());
        }
        if (userIds.size() > 0) {
            List<SysUser> userList = userService.selectBatchIds(userIds);
            for (SysUser user : userList) {
                for (SysUserRole userRole : page.getRecords()) {
                    if (userRole.getUserId().equals(user.getUserId())) {
                        userRole.setUserName(user.getUserName());
                        userRole.setJob(user.getJob());
                        userRole.setPosition(user.getPosition());
                        userRole.setPositionType(user.getPositionType());
                        userRole.setWorkDeptName(user.getWorkDeptName());
                    }
                }
            }
        }
        return this.ResultToJson(page);
    }
}
