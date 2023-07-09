package com.aiguigu.threadPool.customthread;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ThreadPoolUtils
 * @Description TODO
 * @Author huang.qingbin
 * @Date 2023/7/9 9:57
 * @Version 1.0
 **/
public class ThreadPoolUtils<T> {
    /*
        自定义线程池
        4大核心参数
        1、核心线程数
        按照8020原则设计，例如：一个任务执行需要0.1秒，系统80%每秒产生100个任务，那么一秒钟处理完需要10个线程，核心线程数就是10
        2、任务队列长度
        核心线程数/单个任务执行时间*2即可，任务队列长度为200
        3、最大线程数
        最大线程数还需要参照每秒产生的最大任务数，例如：系统每秒产生的最大任务数为1000，最大线程数=(最大任务数-任务队列长度)*单个任务执行时间
        即最大线程数=(1000-200)*0.1=80个
        4、最大空闲时间
        根据系统参数设定，没有固定的参考值
     **/
    //一个任务执行需要s秒，百分之80每秒产生n个任务

    public static Map<String, Object> getCustomThreadAmount(int s, int num,int maxWorkSizeSecond) {
        //完成num个任务需要s*num秒，即对应一秒钟处理num个任务需要多少个线程
        int corePoolSize = s * num;
        //任务队列 缓存区最大队列长度
        int workSize = corePoolSize / s * 2;
        //最大线程数=(最大任务数-任务队列长度)*单个任务执行的时间
        int maxSize = (maxWorkSizeSecond - workSize) * s;

        Map<String, Object> map = new HashMap<>();
        map.put("corePoolSize", corePoolSize);
        map.put("workSize", workSize);
        map.put("maxSize", maxSize);
        return map;

        //线程空闲时间
        //是否允许超市
        //线程名称前缀
        //线程拒绝策略

    }
}
