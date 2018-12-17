package com.tip.restful.manager.api.controller;

import com.tip.restful.core.controller.result.JsonResult;
import com.tip.restful.manager.api.entity.SysMenu;
import com.tip.restful.manager.api.entity.SysRolePermission;
import com.tip.restful.manager.api.service.ISysRolePermissionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tip.restful.core.controller.ControllerBase;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 角色信息表 前端控制器
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-31
 */
@RestController
@RequestMapping("/api/sysRolePermission")
public class SysRolePermissionController extends ControllerBase<SysRolePermission, ISysRolePermissionService> {

}
