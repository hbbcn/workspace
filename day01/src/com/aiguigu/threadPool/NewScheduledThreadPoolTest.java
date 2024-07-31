package com.aiguigu.threadPool;

import java.util.TimerTask;
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
//        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            scheduledThreadPool.schedule(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("delay 3 seconds");
//                }
//            }, 3, TimeUnit.SECONDS);
//        }


        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        //command：执行线程。
        //initialDelay：初始化延时。
        //period：两次开始执行最小间隔时间。
        //unit：计时单位。
        scheduledExecutorService.scheduleAtFixedRate(NewScheduledThreadPoolTest.timerTask(),0,1000,TimeUnit.MILLISECONDS);

        //参数一（Runnable）：命令执行的任务。
        //initialDelay：初始化延时。
        //参数二（delay）       ：延迟执行的时间。
        //参数三（TimerUnit）：延时蚕食的时间单位。
        scheduledExecutorService.scheduleWithFixedDelay(NewScheduledThreadPoolTest.timerTask(),3000,1000,TimeUnit.MILLISECONDS);

    }

    public static TimerTask timerTask () {
        return new TimerTask() {
            @Override
            public void run() {
                System.out.println("执行了");
            }
        };
    }
}

