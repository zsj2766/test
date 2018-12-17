package com.tip.restful.manager.api.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tip.restful.core.common.helper.JSONHelper;
import com.tip.restful.core.common.helper.StringHelper;
import com.tip.restful.core.controller.param.enums.EQDType;
import com.tip.restful.core.controller.param.form.FormParam;
import com.tip.restful.core.controller.param.query.QueryParam;
import com.tip.restful.core.controller.result.JsonResult;
import com.tip.restful.manager.api.entity.SysUnifyUser;
import com.tip.restful.manager.api.entity.SysUser;
import com.tip.restful.manager.api.service.ISysUnifyUserService;
import com.tip.restful.manager.api.service.ISysUserService;
import com.tip.restful.utils.StringUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tip.restful.core.controller.ControllerBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 内部用户信息表 前端控制器
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@RestController
@RequestMapping("/api/sysUser")
public class SysUserController extends ControllerBase<SysUser, ISysUserService> {

    @Autowired
    ISysUnifyUserService iSysUnifyUserService;

    /**
     * 增量获取用户信息列表
     *
     * @param lastmodifyTime
     * @return
     */
    @RequestMapping(value = "incrementUserInfo", method = RequestMethod.GET)
    public JsonResult<?> incrementInfo(String lastmodifyTime) {
        try {
            EntityWrapper<SysUser> ew = new EntityWrapper<SysUser>();
            if (!StringUtils.isEmpty(lastmodifyTime)) {// 最终修改时间参数不为空
                if (lastmodifyTime.indexOf(".") == -1) {// 格式化时间参数
                    lastmodifyTime = String.format("%s.0", lastmodifyTime);
                }

                ew.where(" MODIFY_DATE > to_timestamp({0},'yyyy-mm-dd hh24:mi:ss.ffx') ",
                        lastmodifyTime);
            }
            List<SysUser> list = baseService.selectList(ew);
            return this.ResultToJson(list);
        } catch (Exception ex) {
            return this.ResultToJson(ex);
        }
    }

    /**
     * 根据用户账号获取用户信息
     *
     * @param account
     * @return
     */
    @RequestMapping(value = "getSingleByAccount", method = RequestMethod.GET)
    public JsonResult<?> getSingleByAccount(String account) {
        if (StringUtils.isEmpty(account)) {
            return this.ResultToJson(false, "账号不能为空！");
        }
        try {

            EntityWrapper<SysUser> ew = new EntityWrapper<SysUser>();
            ew.where(" ACCOUNT = {0}", account);
            SysUser user = baseService.selectOne(ew);
            return this.ResultToJson(user);
        } catch (Exception ex) {
            return this.ResultToJson(ex);
        }
    }

    @Override
    public String customFormatWhereSql(String name, EQDType qDtype, String[] values) {
        if ("TopDeptId".equals(name)) {
            String itemWhereSql;
            itemWhereSql = String.format(" WORK_DEPT_ID IN " +
                    "( SELECT DEPT_ID FROM SYS_DEPARTMENT " +
                    "WHERE DEPT_ID = '%s' " +
                    "OR FIND_IN_SET( PARENT_ID, " +
                    "getChildList ('%s','sys_department')))", values[0], values[0]);
            return itemWhereSql;
        }
        return null;
    }

    @Override
    protected void CustomQueryParams(QueryParam<SysUser> queryData) {
        String queryType = queryData.getPageInfo().getParamStr("queryType");
        String selectionIds = queryData.getPageInfo().getParamStr("selectionIds");
        String oaPositionType = queryData.getPageInfo().getParamStr("oaPositionType");
        String paramStr = StringHelper.genStringBySeparator(selectionIds);
        String whereSql = null;
        if ("1".equals(queryType)) {// 机构
            whereSql = " STATE = 1 WORK_DEPT_ID IN  " +
                    "( SELECT DEPT_ID FROM SYS_DEPARTMENT  " +
                    "WHERE DEPT_ID = '%s'  " +
                    "OR FIND_IN_SET( PARENT_ID,  " +
                    "getChildList ('%s','sys_department')))";
        } else if ("2".equals(queryType)) {// 人员
            whereSql = "STATE = 1 AND ID IN (%s)";
        } else if ("3".equals(queryType)) {// 岗位
//            whereSql = " STATE = 1 AND ID IN (SELECT T.USER_ID FROM SYS_USER_POST T WHERE T.POST_ID IN (%s))";
        } else if ("4".equals(queryType)) {// 角色
            whereSql = " STATE = 1 AND ID IN (SELECT T.USER_ID FROM SYS_USER_ROLE T WHERE T.ROLE_ID IN (%s))";
        }

        if (!StringUtils.isEmpty(oaPositionType)) {
            whereSql += String.format(" AND POSITION_TYPE = '%s'", oaPositionType);
        }
        if (!StringUtils.isEmpty(whereSql)) {
            queryData.getEw().where(String.format(whereSql, paramStr));
        }
    }

    @ApiOperation("重置用户密码")
    @RequestMapping( value = {"resetPwd"},  method = {RequestMethod.POST}  )
    public JsonResult<?> resetPwd(String account, String newPwd) {
        try {
            boolean flag = baseService.resetPwd("", account, newPwd);
            return ResultToJson(flag);
        } catch (RuntimeException ex) {
            return ResultToJson(ex);
        }
    }
}
