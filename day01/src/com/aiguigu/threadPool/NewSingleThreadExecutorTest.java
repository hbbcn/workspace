package com.aiguigu.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@ClassName NewSingleThreadExecutorTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/16 23:08
 *@Version 1.0
 */

/**
 * newSingleThreadExecutor 创建一个单线程化的线程池，
 * 它只会用唯一的工作线程来执行任务，
 * 保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 */
public class NewSingleThreadExecutorTest{
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    /* System.out.println(index);*/
                    try {
                        System.out.println(index);
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        singleThreadExecutor.shutdown();
                    }
                }
            });
        }
    }
}

