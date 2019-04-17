package com.example.demo;

import com.example.springaop.CglibProxy;
import com.example.springaop.UserServiceImpl;
import org.junit.Test;

/**
 * @author: SJH
 * @ClassName: CGLibDongTaiDaiLiTests
 * @Description: CGLib动态代理测试
 */
public class CGLibDongTaiDaiLiTests {

    @Test
    public void test() {
        //cglib实现
        CglibProxy cglibProxy = new CglibProxy();
        UserServiceImpl userService = (UserServiceImpl) cglibProxy.getProxy(UserServiceImpl.class);
        System.out.println("cglib>>>>>>代理");
        userService.login();
    }
}
