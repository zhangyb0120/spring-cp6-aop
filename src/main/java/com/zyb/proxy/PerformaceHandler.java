package com.zyb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zyb on 2016/6/26.
 *
 * 横切代码  -- JDK动态代理
 */
public class PerformaceHandler implements InvocationHandler {
    private Object target;

    public PerformaceHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());
        Object obj = method.invoke(target, args);
        PerformanceMonitor.end();
        return obj;
    }
}
