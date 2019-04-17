package com.example.demo;

import com.example.springaop.PerformHandler;
import com.example.springaop.UserService;
import com.example.springaop.UserServiceImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author: SJH
 * @ClassName: DongTaiDaiLiTests
 * @Description: jdk动态代理
 */
public class DongTaiDaiLiTests {

    @Test
    public void test() {
        //测试动态代理
        UserService userService = new UserServiceImpl();
        PerformHandler performHandler = new PerformHandler(userService);
        userService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),//代理对象的类加载器
                        userService.getClass().getInterfaces(),//代理需要实现的接口，可以有多个接口
                        performHandler);//方法调用的实际处理者，代理对象的方法调用都会转发到这里
        System.out.println("jdk>>>>>>>>代理");
        userService.login();
    }
}
