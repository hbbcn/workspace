package com.aiguigu.thread;

import javafx.scene.control.Slider;
import junit.extensions.TestSetup;

/**
 * @ClassName ThreadStop
 * @Description TODO
 * @Author huang.qingbin
 * @Date 2023/7/8 12:20
 * @Version 1.0
 **/
public class ThreadStop implements Runnable{
   public Boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run.....Thread: " + ++i);
        }
    }

    public void stop(){
        this.flag = false;
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadStop threadStop = new ThreadStop();
        new Thread(threadStop).start();
        for (int i = 0; i < 100000; i++) {

            System.out.println("main" + i);
            if(i==80000){
                threadStop.stop();
                System.out.println("该线程终止了");
            }
        }
    }
}
