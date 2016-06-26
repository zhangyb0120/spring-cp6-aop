package com.zyb.proxy;

/**
 * Created by zyb on 2016/6/26.
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformace> performaceRecord = new ThreadLocal<>();

    public static void begin(String method) {
        System.out.println("begin monitor...");
        MethodPerformace mp = performaceRecord.get();
        if (mp == null) {
            mp = new MethodPerformace(method);
            performaceRecord.set(mp);
        } else {
            mp.reset(method);
        }
    }

    public static void end() {
        System.out.println("end monitor...");
        MethodPerformace mp = performaceRecord.get();
        mp.printPerformace();
    }
}
