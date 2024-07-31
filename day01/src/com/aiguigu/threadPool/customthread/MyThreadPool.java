package com.aiguigu.threadPool.customthread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName MyThreadPool
 * @Description 这是自定义的线程池类
 * 成员变量：
 * 1.任务队列   集合  需要控制线程安全问题
 * 2.当前线程数量
 * 3.核心线程数量
 * 4.最大线程数量
 * 5.任务队列长度
 * 成员方法
 *
 * @Author huang.qingbin
 * @Date 2023/7/8 22:40
 * @Version 1.0
 **/
/*


 **/

public class MyThreadPool {

    /**
     * 1:任务队列集合需要控制线程安全问题
     * 2:当前线程数量
     * 3:核心线程数量
     * 4:最大线程数量
     * 5:任务队列的长度
     */
    private List<Runnable> tasks = Collections.synchronizedList(new LinkedList<>());
    private int num;
    private int corePoolSize;
    private int maxSize;
    private int workSize;

    public MyThreadPool(int corePoolSize, int maxSize, int workSize) {
        this.corePoolSize = corePoolSize;
        this.maxSize = maxSize;
        this.workSize = workSize;
    }

    //1.提交任务
    public  void submit(Runnable r) throws InterruptedException {
        //判断当前集合中最大任务数量。是否超出最大任务数量
        if (tasks.size() >= workSize){
            System.out.println("任务：" + r + "被丢弃了");
        }else {
            tasks.add(r);
            Thread.sleep(1000);
            //执行任务
            execTask(r);
        }
    }

    //2.执行任务
    private void execTask(Runnable r) {
        //判断当前线程池的线程总数量，是否超出了核心数
        if (num < corePoolSize){
            new MyWorker("核心线程" + num ,tasks).start();
            num++;
        }else if (num < maxSize){
            new MyWorker("非核心线程" + num ,tasks).start();
            num++;
        }else {
            System.out.println("任务:" + r + "被缓存了");
        }
    }


}
