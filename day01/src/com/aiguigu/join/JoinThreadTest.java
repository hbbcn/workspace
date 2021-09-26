package com.aiguigu.join;
/**
 *@ClassName JoinThreadTest
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/5 10:23
 *@Version 1.0
 */
public class JoinThreadTest{

    public static void main(String[] args) {

            Thread t1 = new Thread(new Runnable() {

                @Override
                public void run() {
                    for(int i=0;i<10;i++){
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        System.out.println(Thread.currentThread().getName()+"i"+i);
                    }

                }
            });
//        t1.start();

        //主线程在此调用t1.join()方法，就认为主线程应该把执行权交给t1 让t1执行完毕后再执行主线程
//        try {
//            t1.join();
//        } catch (InterruptedException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
        t1.start();

            for(int i=0; i<50;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("main"+"i"+i);
        }



    }
}

