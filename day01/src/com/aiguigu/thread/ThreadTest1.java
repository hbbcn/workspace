package com.aiguigu.thread;
/**
 *@ClassName ThreadTest1
 *@Description  创建多线程方式二：实现Runnable接口
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中抽象方法：run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象说明start()
 *
 *@Author HuangQingbin
 *@Date 2021/5/22 22:27
 *@Version 1.0
 */

//创建一个实现了Runnable接口的类
class Mthread implements Runnable{

    //实现类去实现Runnable中的抽象方法：run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+" " + i);
            }
        }
    }
}
public class ThreadTest1{

    public static void main(String[] args) {
        //创建实现类的对象
        Mthread mthread = new Mthread();
        //将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mthread);
        t1.start();

        Thread t2 = new Thread(mthread);
        t2.start();
    }
}

