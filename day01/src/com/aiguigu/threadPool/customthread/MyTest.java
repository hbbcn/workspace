package com.aiguigu.threadPool.customthread;

/**
 * @ClassName MyTest
 * @Description 测试类
 *              1.创建线程池对象
 *              2.提交多个任务
 * @Author huang.qingbin
 * @Date 2023/7/9 11:21
 * @Version 1.0
 **/
public class MyTest {

    public static void main(String[] args) throws InterruptedException {
        //1.创建线程池类对象
        MyThreadPool pool = new MyThreadPool(2, 4, 20);
        //2.提交多个任务
        for (int i = 0; i < 10; i++) {
            //创建任务对象并提交给线程池
            MyTask myTask = new MyTask(i);
            pool.submit(myTask);
        }
    }
}
