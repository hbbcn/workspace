package com.test;
/**
 *@ClassName Test06
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/27 15:38
 *@Version 1.0
 */
public class Test06{


    static{
        System.out.println(1);
    }
    public Test06(){
        System.out.println(2);
    }
}

class B extends Test06{
    static {
        System.out.println("a");
    }

    public B() {
        System.out.println("b");
    }
}
class Test{
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B();
    }
}

