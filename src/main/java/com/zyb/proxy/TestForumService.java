package com.zyb.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zyb on 2016/6/26.
 */
public class TestForumService {
    public static void main(String[] args) {
        // 最原始
//        ForumService forumService = new ForumServiceImpl();
//        forumService.removeForum(10);
//        forumService.removeTopic(1012);

        // jdk 动态代理
//        ForumService target = new ForumServiceImpl();
//        PerformaceHandler handler = new PerformaceHandler(target);
//        ForumService proxy = (ForumService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
//                target.getClass().getInterfaces(),
//                handler);
//        proxy.removeTopic(10);
//        proxy.removeForum(1014);

        // cglib 动态代理
        CglibProxy proxy = new CglibProxy();
        ForumService forumService = (ForumService) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeTopic(10);
        forumService.removeForum(1014);

    }
}
