package com.example.hhh.config;

import com.example.hhh.model.Permission;
import com.example.hhh.model.Role;
import com.example.hhh.model.User;
import com.example.hhh.service.RoleService;
import com.example.hhh.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2019/4/21.
 */

public class UserRealm extends AuthorizingRealm{

    private final static Logger logger = Logger.getLogger(UserRealm.class);

    @Resource
    private UserService userService;
    @Resource
    private RoleService roleService;
    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.debug("##################执行Shiro权限认证##################");
        User user = (User) principalCollection.getPrimaryPrincipal();
        if(user!=null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            Role role = roleService.getById(user.getRole().getrId());
            List<Permission> permissions = role.getPermissions();
            for (Permission p : permissions){
                info.addStringPermission(p.getpAlias());
            }
            info.addRole(role.getrAlias());
            return info;
        }
        return null;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        /*UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        logger.info("用户验证执行 : "+token.getUsername());
        User user = userService.getByEmail(token.getUsername(),true);
        if(user==null){
            logger.error("用户 { "+token.getUsername()+" } 不存在 ");
            throw new AccountException("账户不存在");
        }
        if(user.getStatus()==0){
            logger.error("用户 { "+token.getUsername()+" } 被禁止登录 ");
            throw new DisabledAccountException("账号已经禁止登录");
        }else{
            user.setUpdated(DateUtils.getNowTimestamp());
            user.setUpdatedAt(DateUtils.getNowFormatDate(null));
            System.out.println("效验更新前ROLE："+user.getRole().getrId());
            userService.update(user,true,user.getId());
        }
        return new SimpleAuthenticationInfo(user,user.getPassword(),getName());*/
        return null;
    }
}
