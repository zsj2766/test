package com.tip.restful.manager.api.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tip.restful.core.controller.result.JsonResult;
import com.tip.restful.manager.api.entity.SysMenu;
import com.tip.restful.manager.api.entity.SysRolePermission;
import com.tip.restful.manager.api.service.ISysMenuService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tip.restful.core.controller.ControllerBase;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 菜单信息表 前端控制器
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@RestController
@RequestMapping("/api/sysMenu")
public class SysMenuController extends ControllerBase<SysMenu, ISysMenuService> {

    @RequestMapping(value = "loadRoleMenus", method = RequestMethod.GET)
    public JsonResult<?> loadRoleMenus(String roleId, String menuType) {
        List<SysMenu> list = new ArrayList<SysMenu>();
        EntityWrapper<SysMenu> ew = new EntityWrapper<SysMenu>();
        ew.where(" MENU_ID IN (" +
                "SELECT DISTINCT M.PARENT_ID FROM SYS_MENU M " +
                "WHERE M.MENU_TYPE IN (2, 3) AND " +
                "M.MENU_ID IN (SELECT P1.MENU_ID " +
                "FROM SYS_ROLE_PERMISSION P1 WHERE P1.ROLE_ID = {0}) " +
                "UNION " +
                "SELECT P.MENU_ID FROM SYS_ROLE_PERMISSION P " +
                "WHERE P.ROLE_ID = {0})", roleId);
        if (!StringUtils.isEmpty(menuType)) {
            ew.in(" MENU_TYPE", menuType.split(","));
        }
        list = baseService.selectList(ew);
        return this.ResultToJson(list);
    }
}
