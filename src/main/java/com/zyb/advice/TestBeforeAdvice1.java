package com.zyb.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zyb on 2016/6/26.
 */
public class TestBeforeAdvice1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        System.out.println(waiter.getClass().toString());
    }
}
