package com.aiguigu.threadPool.customthread;

import java.util.List;

/**
 * @ClassName MyWorker
 * @Description 这是一个线程类
 * @Author huang.qingbin
 * @Date 2023/7/8 22:30
 * @Version 1.0
 **/
public class MyWorker extends Thread{

    private String name; //保存线程名字
    private List<Runnable> tasks;

    public MyWorker(String name, List<Runnable> tasks){
        super(name);
        this.tasks = tasks;

    }

    @Override
    public void run() {
        //判断集合中是否有任务，只要有任务就一直执行
        while (tasks.size() > 0){
            //移除第一个任务并执行
            Runnable runnable = tasks.remove(0);
            //开始执行
            runnable.run();
        }

    }
}
