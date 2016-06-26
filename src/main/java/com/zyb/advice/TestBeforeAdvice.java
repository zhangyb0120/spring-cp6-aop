package com.zyb.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by zyb on 2016/6/26.
 */
public class TestBeforeAdvice {
    public static void main(String[] args) {

        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        // spring提供的代理工厂
        ProxyFactory pf = new ProxyFactory();
        pf.setInterfaces(target.getClass().getInterfaces()); // 指定对接口进行代理，则ProxyFactory内部会使用JDK代理
        pf.setOptimize(true); // 启动优化，默认会使用cglib代理，无论是否setInterfaces()

        // 设置代理目标
        pf.setTarget(target);

        // 为代理目标添加增强
        pf.addAdvice(advice);

        // 生成代理实例
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
        System.out.println(proxy.getClass().toString());
    }
}
