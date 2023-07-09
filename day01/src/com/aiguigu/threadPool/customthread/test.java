package com.aiguigu.threadPool.customthread;

/**
 * @ClassName test
 * @Description TODO
 * @Author huang.qingbin
 * @Date 2023/7/9 11:37
 * @Version 1.0
 **/
public class test {
    public static void main(String[] args) {
        test01(3);
    }

    public static void test01(int i){
        if (i < 6){
            System.out.println(i);
        }else if (i < 9){
            System.out.println(i);
        }
    }
}
