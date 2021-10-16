package com.cn.test;

import org.junit.Test;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Scanner;

/**
 *@ClassName Solution
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/29 21:02
 *@Version 1.0
 */
public class Solution{

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = scanner.next();
        System.out.println("你输入的名字是：" + name);
*/


        int i = numKLenSubstrRepeats("createfunonyoka", 4);
        System.out.println(i);
    }

    @Test
    public void test(){

        Integer[] array = new Integer[]{1,2,3,4,5,6};
        System.out.println();
        System.out.println(array.length);
        String s = Arrays.toString(array);
        System.out.println(s);

        for (int i = 0; i < 10; i++) {

            continue;
        }
    }


    public static int numKLenSubstrRepeats (String s, int k) {
        // write code here
        char[] array = s.toCharArray();
        int sum = 0;
        for(int i = 0; i <= array.length-k; i++){
            System.out.print(array[i]);
            for(int j = i + 1; j < (i + k); j++){

                System.out.print(array[j]);
                for (int l = 0; l < 4; l++) {
                    if(array[i] == array[j]){
                        sum++;
                    }else {
                        i++;
                    }
                }
                if(array[i] == array[j]){

                    sum++;
                    System.out.println(sum);
                    break;
                }
            }
            System.out.println();
        }
        return sum;
    }
}

