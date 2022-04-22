package com.aiguigu.lock;
/**
 *@ClassName WhatReenReant
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/13 14:02
 *@Version 1.0
 */

//可重入锁演示
public class WhatReentrant {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println("第1次获取锁，这个锁是：" + this);
                    int index = 1;
                    while (true) {
                        synchronized (this) {
                            System.out.println("第" + (++index) + "次获取锁，这个锁是：" + this);
                        }
                        if (index == 10) {
                            break;
                        }
                    }
                }
            }
        }).start();
    }
}
