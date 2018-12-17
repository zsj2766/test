package com.tip.restful.manager.api.service.impl;

import com.tip.restful.core.service.ServiceBaseImpl;
import com.tip.restful.manager.api.dao.SysUnifyUserMapper;
import com.tip.restful.manager.api.dao.SysUserMapper;
import com.tip.restful.manager.api.entity.SysUnifyUser;
import com.tip.restful.manager.api.entity.SysUser;
import com.tip.restful.manager.api.service.ISysUserService;
import com.tip.restful.utils.SSOEnDeUtil;
import com.tip.restful.utils.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 内部用户信息表 服务实现类
 * </p>
 *
 * @author Auto-Generated
 * @since 2018-07-11
 */
@Service
public class SysUserServiceImpl extends ServiceBaseImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Resource
    SysUnifyUserMapper sysUnifyUserMapper;

    @Override
    public boolean insert(SysUser entity) {

        Boolean flag = super.insert(entity);
        if (flag) {
            String password = "1";
            try {
                password = SSOEnDeUtil.encodePassword(password,"MD5");
                password = SSOEnDeUtil.enBase64XorString(password,
                        SSOEnDeUtil.SSO_BASE64_KEY);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            SysUnifyUser unifyUser = new SysUnifyUser();
            unifyUser.setUserId(entity.getUserId());
            unifyUser.setAccount(entity.getAccount());
            unifyUser.setUserName(entity.getUserName());
            unifyUser.setState(entity.getState());
            unifyUser.setPassword(password);
            unifyUser.setMobile(entity.getMobile());
            unifyUser.setEmail(entity.getEmail());
            unifyUser.setQq(entity.getQq());
            unifyUser.setWeixin(entity.getWeixin());
            unifyUser.setSource("1");
            unifyUser.setAccountType("1");

            flag = retBool(sysUnifyUserMapper.insert(unifyUser));
        }
        return flag;
    }

    @Override
    public boolean updateById(SysUser entity) {
        Boolean flag = super.updateById(entity);
        if (flag) {
            SysUnifyUser unifyUser = new SysUnifyUser();
            unifyUser.setUserId(entity.getUserId());
            unifyUser.setAccount(entity.getAccount());
            unifyUser.setUserName(entity.getUserName());
            unifyUser.setState(entity.getState());
            unifyUser.setMobile(entity.getMobile());
            unifyUser.setEmail(entity.getEmail());
            unifyUser.setQq(entity.getQq());
            unifyUser.setWeixin(entity.getWeixin());
//            unifyUser.setPhone(entity.get);
            flag = retBool(sysUnifyUserMapper.updateById(unifyUser));
        }
        return flag;
    }

    @Override
    public boolean resetPwd(String userId, String account, String newPwd) {
        SysUnifyUser unifyUser = null;
        if (!StringUtils.isEmpty(userId)) {
            unifyUser = sysUnifyUserMapper.selectById(userId);
        } else {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("account", account);
            List<SysUnifyUser> users = sysUnifyUserMapper.selectByMap(map);
            if (users != null && users.size() > 0) {
                unifyUser = users.get(0);
            }
        }
        if (unifyUser != null) {
            try {
                newPwd = SSOEnDeUtil.encodePassword(newPwd,"MD5");
                newPwd = SSOEnDeUtil.enBase64XorString(newPwd,
                        SSOEnDeUtil.SSO_BASE64_KEY);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            unifyUser.setPassword(newPwd);
            return retBool(sysUnifyUserMapper.updateById(unifyUser));
        } else {
            throw new RuntimeException("无法找到相应用户信息！");
        }
    }
}
