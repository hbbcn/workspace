package com.aiguigu.thread;

/**
 * @ClassName Singleton3
 * @Description TODO
 * @Author huang.qingbin
 * @Date 2023/6/28 18:30
 * @Version 1.0
 */


class SingletonTest3 {

 public static void main(String[] args) {

  Singleton3 instance1 = Singleton3.getInstance();
  Singleton3 instance2 = Singleton3.getInstance();

  System.out.println(instance1 == instance2);//true 同一对象

  System.out.println("hashcode= "+instance1.hashCode()+"  "+instance2.hashCode());

 }
}


/*懒汉式（非线程安全）*/
class Singleton3 {

 /*提供静态对象实例*/
 private static Singleton3 instance;

 /*私有的构造器，外部不能new对象实例*/
 private Singleton3(){

 }

 /*
  *   提供一个静态公有方法，当使用该方法时，采取创建instance
  *   即懒汉式
  * */
 public static Singleton3 getInstance(){

  /*使用时才创建*/
  if(instance == null){
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
   instance = new Singleton3();
  }
  return instance;
 }
}


