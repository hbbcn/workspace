package com.try_catch_finally;
/**
 *@ClassName TryTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/16 21:59
 *@Version 1.0
 */
public class TryTest{
    public static void main(String[] args) {
        System.out.println("return的返回值：" + test());
    }
    // finally是在return后面的表达式运算之后执行的，此时并没有返回运算之后的值，
    //而是把值保存起来，不管finally对该值做任何的改变，返回的值都不会改变，依然返回保存起来的值。
    //也就是说方法的返回值是在finally运算之前就确定了的。
    static int test() {
        int x = 1;
        try {
            return x++; //先return,后+1,返回值为1
        } catch(Exception e){

        }finally {
            System.out.println("finally:" + x);
            ++x;
            System.out.println("++x:" + x);
            // finally代码中最好不要包含return，程序会提前退出，
            // 也就是说返回的值不是try或catch中的值,而是finally中的值
            // return x;
        }
        return 5;
    }
}

