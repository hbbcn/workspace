package com.test;
/**
 *@ClassName Test03
 *@Description  TODO
 *@Author hqb
 *@Date 2022/1/30 22:44
 *@Version 1.0
 */
public class Test03 extends Test02{


    public Test03 buy(){

        return null;
    }

   public void find(){
       System.out.println(i);
    }

    public void test(){
        System.out.println(i);
    }

    public void buy01(){
        System.out.println("子类的方法");
    }

    public static void main(String[] args) {
        Test02 t = new Test03();
        t.buy01();
    }
}



