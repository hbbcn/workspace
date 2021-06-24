package com.aiguigu.myexer;
/**
 *@ClassName exer2
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/23 17:53
 *@Version 1.0
 */
public class Windows extends Thread {

    static int ticket = 100;
    static  Object com = new Object();
    public void run(){

           while (true){
               synchronized (com){
               if(ticket > 0){
                   System.out.println(Thread.currentThread().getName()+ "当前票数为" + ticket);
                   ticket--;
               }else{
                   break;
               }

           }
       }

    }
}
class Test{
    public static void main(String[] args) {
        Windows w1 = new Windows();
        Windows w2 = new Windows();
        Windows w3 = new Windows();
        w1.start();
        w2.start();
        w3.start();
    }

}


