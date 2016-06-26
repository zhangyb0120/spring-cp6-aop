package com.zyb.advice;

import com.zyb.proxy.ForumExceptionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zyb on 2016/6/26.
 */
public class TestBeforeAdvice2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
        ForumExceptionService forumExceptionService = (ForumExceptionService) ctx.getBean("forumExceptionService");
        forumExceptionService.removeTopic(1111);
        System.out.println(forumExceptionService.getClass().toString());
    }
}
