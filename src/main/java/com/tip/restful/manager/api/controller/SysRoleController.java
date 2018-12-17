package com.tip.restful.manager.api.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tip.restful.core.common.helper.JSONHelper;
import com.tip.restful.core.controller.param.form.FormParam;
import com.tip.restful.core.controller.result.JsonResult;
import com.tip.restful.manager.api.entity.SysPermission;
import com.tip.restful.manager.api.entity.SysRole;
import com.tip.restful.manager.api.entity.SysRolePermission;
import com.tip.restful.manager.api.service.ISysPermissionService;
import com.tip.restful.manager.api.service.ISysRolePermissionService;
import com.tip.restful.manager.api.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
 * @since 2018-07-11
 */
@RestController
@RequestMapping("/api/sysRole")
public class SysRoleController extends ControllerBase<SysRole, ISysRoleService> {

    @Autowired
    private ISysRolePermissionService sysRolePermissionService;

    @Override
    public JsonResult<SysRole> getSingleById(String id) {
        SysRole sysRole = baseService.selectById(id);
        EntityWrapper<SysRolePermission> ew = new EntityWrapper<SysRolePermission>();
        ew.where(" ROLE_ID = {0} AND PERMISSION_TYPE = 1 ", id);
        List<SysRolePermission> permissionList = sysRolePermissionService.selectList(ew);
        List<String> list = new ArrayList<String>();
        for (SysRolePermission permission : permissionList) {
            list.add(permission.getMenuId());
        }
        sysRole.setAuthList(list);
        return this.ResultToJson(sysRole);
    }

    @Override
    public JsonResult<?> add(String json) {
        FormParam formData = FormParam.parseFormData(json);
        SysRole entity = formData.genFormDataEntity(this.entityClazz);
        this.baseService.insert(entity);

        List<String> list = entity.getAuthList();
        for (String menuId : list) {
            SysRolePermission permission = new SysRolePermission();
            permission.setPermissionType("1");
            permission.setMenuId(menuId);
            permission.setRoleId(entity.getRoleId());
            sysRolePermissionService.insert(permission);
        }

        List<String> list2 = entity.getParentAuthList();
        for (String menuId : list2) {
            SysRolePermission permission = new SysRolePermission();
            permission.setPermissionType("0");
            permission.setMenuId(menuId);
            permission.setRoleId(entity.getRoleId());
            sysRolePermissionService.insert(permission);
        }

        return this.ResultToJson(entity);
    }

    @Override
    public JsonResult<?> updateById(String json) {
        FormParam formData = FormParam.parseFormData(json);
        SysRole entity = formData.genFormDataEntity(this.entityClazz);
        this.baseService.updateById(entity);
        EntityWrapper<SysRolePermission> ew = new EntityWrapper<SysRolePermission>();
        ew.where(" ROLE_ID = {0} ", entity.getRoleId());
        sysRolePermissionService.delete(ew);

        List<String> list = entity.getAuthList();
        for (String menuId : list) {
            SysRolePermission permission = new SysRolePermission();
            permission.setPermissionType("1");
            permission.setMenuId(menuId);
            permission.setRoleId(entity.getRoleId());
            sysRolePermissionService.insert(permission);
        }

        List<String> list2 = entity.getParentAuthList();
        for (String menuId : list2) {
            SysRolePermission permission = new SysRolePermission();
            permission.setPermissionType("0");
            permission.setMenuId(menuId);
            permission.setRoleId(entity.getRoleId());
            sysRolePermissionService.insert(permission);
        }
        return this.ResultToJson(entity);
    }
}
