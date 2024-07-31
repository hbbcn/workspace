package com.aiguigu.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName NewFixedThreadPoolTest
 * @Description TODO
 * @Author hqb
 * @Date 2022/4/16 22:59
 * @Version 1.0
 */
public class NewFixedThreadPoolTest {
    /**
     * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
     * @param args
     */
    public static void main(String[] args) {
            ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
            for (int i = 0; i < 10; i++) {
                final int index = i;
                fixedThreadPool.execute(new Runnable() {
                    public void run() {
                        try {
                            System.out.println("++++++++++++++++++++++++++");

                            System.out.println(index);
                            System.out.println(Thread.currentThread().getName());
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }finally {
                            fixedThreadPool.shutdown();
                        }
                    }
                });
            }
    }

}

