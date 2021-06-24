package com.aiguigu.exer;

/**
 * @ClassName ProductTest
 * @Description 线程通信的应用：经典例题：生产者/消费者
 * <p>
 * 分析：
 * 1.是否是多个线程问题？是，生产者线程，消费者线程
 * 2.是否有共享数据？是，店员（或产品）
 * 3.如何解决线程的安全问题？同步机制，有三种方法
 * 4.是否涉及线程的通信？是
 * @Author HuangQingbin
 * @Date 2021/5/27 23:41
 * @Version 1.0
 */

class Clerk {


    private int i = 0;

    public synchronized void producerProcduct() {

            if (i < 20) {
                i++;
                System.out.println(Thread.currentThread().getName() + "开始生产第" + i + "产品");
                notify();

            } else {

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


    }

    public synchronized void consumerProducter() {

            if(i > 0){
                System.out.println(Thread.currentThread().getName() + "开始消费第" + i + "产品");
                i--;
                notify();
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}

class Producer extends Thread {//生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println( getName() + "开始生产产品：");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.producerProcduct();
        }

    }
}

class Consumer extends Thread {//消费者

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费产品：");

        while(true){

            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumerProducter();
        }


    }
}


public class ProductTest {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者");
        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者");

        p1.start();
        c1.start();

    }


}


