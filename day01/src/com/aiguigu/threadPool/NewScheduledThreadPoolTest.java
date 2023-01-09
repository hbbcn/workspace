package com.aiguigu.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *@ClassName NewScheduledThreadPoolTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/16 23:04
 *@Version 1.0
 */
//newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
public class NewScheduledThreadPoolTest{
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        try {
            for (int i = 0; i < 10; i++) {
                scheduledThreadPool.schedule(new Runnable() {
                    public void run() {
                        System.out.println("delay 3 seconds");
                    }
                }, 2, TimeUnit.SECONDS);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scheduledThreadPool.shutdown();
        }


    }

}

