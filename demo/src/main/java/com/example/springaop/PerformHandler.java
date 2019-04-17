package com.example.springaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: SJH
 * @ClassName: springaop
 * @Description: jdk动态代理类
 */
public class PerformHandler implements InvocationHandler {

    private Object target;

    public PerformHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法触发了");
        Object invoke = method.invoke(target, args);
        System.out.println("执行完毕了");
        return invoke;
    }
}
