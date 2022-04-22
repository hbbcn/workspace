package com.atguigu.test02;
/**
 *@ClassName AA
 *@Description  TODO
 *@Author hqb
 *@Date 2022/2/28 19:32
 *@Version 1.0
 */
public class AA{

    public static void main(String[] args) {
        int i = 0, s = 0;
        do{
            if (i%2 == 0){
                i++;
                continue;
            }
            i++;
            s = s+ i;

        }while (i < 7);
        System.out.println(s);
    }
}

