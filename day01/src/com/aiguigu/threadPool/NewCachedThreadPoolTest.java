package com.aiguigu.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName NewCachedThreadPoolTest
 * @Description TODO
 * @Author hqb
 * @Date 2022/4/16 22:55
 * @Version 1.0
 */
public class NewCachedThreadPoolTest {

    /**
     * newCachedThreadPool 这里的线程池是无限大的，当一个线程完成任务之后，
     * 这个线程可以接下来完成将要分配的任务，而不是创建一个新的线程。
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}

