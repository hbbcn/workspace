package com.aiguigu.thread;

/**
 * @ClassName ThreadMethod
 * @Description 测试Thread中常用的方法：
 * 1.start():启动当前线程：调用当前线程run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程名字
 * 6.yiled():释放当前cpu的执行权
 * 7.join():在线程A中调用线程B的join()方法，此时线程A就处于阻塞状态，只有线程B执行完以后，线程A才结束阻塞状态
 * 8.sleep():让当前线程”睡眠“指定的millitime毫米
 * 9.stop()已过时，当执行此方法时，强制结束当前线程
 * 10.isAlive:判断当前线程是否存活
 * <p>
 * <p>
 * 线程的优先级
 * 1.
 * MAX_PRIORITY 10
 * MIN_PRIORITY 1
 * NORM_PRIORIT 5
 * <p>
 * 2.如何获取和设置当前线程的优先级
 * getPriority()获取线程的由优先级
 * setPriority()（int p)设置线程的优先级
 * <p>
 * 说明：高优先级的线程抢占低优先级的线程cpu的执行权，只是概率低优先级的高。
 * @Author HuangQingbin
 * @Date 2021/5/22 15:26
 * @Version 1.0
 */
public class ThreadMethod {

    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:1");
//        h1.setName("线程一");
        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        //主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + "  " + i);
            }

            if (i == 20) {
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(h1.isAlive());
    }
}

class HelloThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + getPriority() + " " + i);
            }

//            try {
//                sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

//            if (i % 20 == 0){
//                this.yield();
//            }
        }

    }

    public HelloThread(String name) {
        super(name);


    }

}

