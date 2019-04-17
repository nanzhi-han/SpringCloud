package com.example.demo;

import com.example.springaop.CglibProxy;
import com.example.springaop.CglibProxy1;
import com.example.springaop.UserServiceImpl;
import com.example.springaop.cgclb;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author: SJH
 * @ClassName: CGLibDongTaiDaiLiTests
 * @Description: CGLib动态代理测试
 */
public class CGLibDongTaiDaiLiTests1 {

    @Test
    public void test() {
        //cglib实现
        CglibProxy1 cglibProxy = new CglibProxy1();
        cgclb proxy = (cgclb) cglibProxy.getProxy(cgclb.class);
//        UserServiceImpl userService = (UserServiceImpl) cglibProxy.getProxy(cgclb.class);
        //proxy.sayhi("888==");
//        userService.login();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cgclb.class);
        enhancer.setCallback(cglibProxy);
        cgclb cgclb = (cgclb) enhancer.create();
        System.out.println(cgclb.sayhi("888=="));
    }
}
