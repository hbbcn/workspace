package com.aiguigu.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *@ClassName ThreadCallable
 *@Description
 * 创建线程的方式三：实现Callable接口，----》JDK 5.0新增
 *
 *
 * 如何理解实现Callable接口的方式创建多线程实现Runnable类接口创建方式强大？
 * 1.call()可以有返回值。
 * 2.call()可以抛出异常，被外面的操作捕获，获取异常信息
 * 3.call()是支持泛型的
 *@Author HuangQingbin
 *@Date 2021/5/28 15:59
 *@Version 1.0
 */
//1.创建一个实现Callable的实现类
class NumThread implements Callable {

//2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }

        }
        return  sum;
    }
}
public class ThreadCallable{

    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4.将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();

        try {
            //get 返回值即为FutureTask构造器参数Callable实现类重写的call()返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

