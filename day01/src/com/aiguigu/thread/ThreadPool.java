package com.aiguigu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *@ClassName ThreadPool
 *@Description
 *  创建线程的方式四：使用线程池
 *
 *  好处：
 *   ----》提高响应速度（减少了创建线程的时间）
 *   ----》降低资源消耗
 *   ----》(重复利用线程池中线程，不需要每次都创建）
 *   ----》便于线程管理
 *   corePoolSize:核心池的大小
 *   MaximumPoolSize:最大线程数
 *   keepAliveTime:线程没有任务最多保持多长时间后会终止
 *@Author HuangQingbin
 *@Date 2021/5/29 19:46
 *@Version 1.0
 */

class NumberThread implements Runnable{


        @Override
        public void run() {

            for (int i = 0; i < 100; i++) {
                if(i % 2 == 0){
                    System.out.println(Thread.currentThread().getName() + ":" + i);

                }
            }
        }


}

class NumberThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ";" + i);
            }
        }
    }
}
public class ThreadPool {

    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        System.out.println(service.getClass());
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();
        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());
        service.execute(new NumberThread2());//适合使用于Runnable
       // service.submit();//适合适用于Callable

        service.shutdown();
    }
}





