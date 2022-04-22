package com.atguigu.settest;
/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2022/2/28 20:00
 *@Version 1.0
 */
public class Test{
    public static void main(String[] args) {
        char c = 'A';
        int num = 5;
        switch (c){
            case 'B':
                num++;
            case 'A':
                num++;
            case '2':
                System.out.println(1111);
                break;
                default:num--;



        }
        System.out.println(num);
    }
}

