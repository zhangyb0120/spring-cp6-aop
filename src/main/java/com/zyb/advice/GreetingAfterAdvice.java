package com.zyb.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by zyb on 2016/6/26.
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnObj, Method method, Object[] args,
                               Object obj) throws Throwable {
        System.out.println("Please enjoy yourself!");
    }
}
