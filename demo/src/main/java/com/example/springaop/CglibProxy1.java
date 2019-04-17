package com.example.springaop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: SJH
 * @ClassName: CglibProxy
 * @Description: cglib动态代理
 */
public class CglibProxy1 implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    //设置被代理对象
    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        System.out.println(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理之前之前");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib代理之前之后");

        return invokeSuper;
    }
}
