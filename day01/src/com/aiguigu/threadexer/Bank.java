package com.aiguigu.threadexer;

import javax.xml.transform.Source;

/**
 * @ClassName Bank
 * @Description TODO
 * @Author hqb
 * @Date 2022/2/21 23:07
 * @Version 1.0
 */
//Bank类
 class Bank {

    public static void main(String[] args) {
        Runnable runnable = new SynchronizeRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
    private int money = 0;
    public void addMoney(int m) {
        money += m;
    }
    public void subMoney(int m) {
        money -= m;
    }
    public void getmoney() {
        System.out.println("Money：" + money);
    }
}
//实现Runnable接口类
class SynchronizeRunnable implements Runnable {
    private Bank bank = new Bank();
    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            bank.addMoney(1);
            bank.getmoney();
        }

    }
}




