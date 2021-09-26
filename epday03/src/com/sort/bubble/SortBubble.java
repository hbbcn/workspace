package com.sort.bubble;
//排序:冒泡排序

import java.util.Scanner;

public class SortBubble {

    public static void main(String[] args) {
        int arry[] = new int[]{6, 3, 12, 5, 17, 2, 26, 65};
        int max = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] > arry[j + 1]) {

                    max = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = max;
                }
            }
        }
        for (int n = 0; n < arry.length; n++)
            System.out.print(arry[n] + "  ");

    }

}