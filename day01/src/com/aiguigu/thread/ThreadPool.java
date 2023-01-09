package com.aiguigu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName ThreadPool
 * @Description 创建线程的方式四：使用线程池
 * <p>
 * 好处：
 * ----》提高响应速度（减少了创建线程的时间）
 * ----》降低资源消耗
 * ----》(重复利用线程池中线程，不需要每次都创建）
 * ----》便于线程管理
 * corePoolSize:核心池的大小
 * MaximumPoolSize:最大线程数
 * keepAliveTime:线程没有任务最多保持多长时间后会终止
 * @Author HuangQingbin
 * @Date 2021/5/29 19:46
 * @Version 1.0
 */

class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ";" + i);
            }
        }
    }
}

/**
 * corePoolSize：核心线程数，也是线程池中常驻的线程数，线程池初始化时默认是没有线程的，
 * 当任务来临时才开始创建线程去执行任务。
 * maximumPoolSize：最大线程数，在核心线程数的基础上可能会额外增加一些非核心线程，
 * 需要注意的是只有当workQueue队列填满时才会创建多于corePoolSize的线程(线程池总线程数不超过maxPoolSize)
 * keepAliveTime：非核心线程的空闲时间超过keepAliveTime就会被自动终止回收掉，
 * 注意当corePoolSize=maxPoolSize时，keepAliveTime参数也就不起作用了(因为不存在非核心线程)；
 * unit：keepAliveTime的时间单位
 * workQueue：用于保存任务的队列，可以为无界、有界、同步移交三种队列类型之一，
 * 当池子里的工作线程数大于corePoolSize时，这时新进来的任务会被放到队列中
 * threadFactory：创建线程的工厂类，默认使用Executors.defaultThreadFactory()，
 * 也可以使用guava库的ThreadFactoryBuilder来创建。
 * handler：线程池无法继续接收任务(队列已满且线程数达到maximunPoolSize)时的饱和策略，
 * 取值有AbortPolicy、CallerRunsPolicy、DiscardOldestPolicy、DiscardPolicy

 */

public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        Executors.newCachedThreadPool();
        System.out.println(service.getClass());
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        service1.setCorePoolSize(10);
//        service1.setKeepAliveTime();
        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());
        service.execute(new NumberThread2());//适合使用于Runnable
//         service.submit();//适合适用于Callable
        service.shutdown();
    }
}





