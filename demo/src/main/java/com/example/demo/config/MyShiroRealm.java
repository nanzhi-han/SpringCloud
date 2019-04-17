package com.example.demo.config;

import com.example.demo.model.SysPermission;
import com.example.demo.model.SysRole;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoServie;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * @author: SJH
 * @ClassName: MyShiroRealm
 * @Description:
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Resource
    private UserInfoServie userInfoServie;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        UserInfo userInfo = (UserInfo)principals.getPrimaryPrincipal();
        for (SysRole role : userInfo.getRoleList()) {
            authorizationInfo.addRole(role.getRole());
            for (SysPermission sysPermission : role.getPermissions()) {
                authorizationInfo.addStringPermission(sysPermission.getPermission());
            }
        }
        return authorizationInfo;
    }

    //主要是用来进行身份验证的，也就是说验证用户输入的帐号密码是否正确
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户输入的帐号
        String username = (String) token.getPrincipal();
        System.out.println(token.getCredentials());
        //通过username从数据库查找user对象，
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        UserInfo userInfo = userInfoServie.findByUsername(username);
        System.out.println("----->>userInfo="+userInfo);
        if (userInfo == null) {
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo,//用户名
                userInfo.getPassword(),//密码
                ByteSource.Util.bytes(userInfo.getCredentialsSalt()),//salt=username+salt
                getName()//realm name

        );
        return authenticationInfo;
    }
}
