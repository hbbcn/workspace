package com.atguigu.exer;

import java.util.*;

//杨辉三角 arry[i][j] = arry[i-1][j] + arry[i-1][j-1]
public class YangHui {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int Arry[][] = new int[10][];
        for (int n = 0; n < 10; n++)
            Arry[n] = new int[n + 1];
        Arry[0][0] = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == j) {
                    Arry[i][j] = Arry[0][0];
                    System.out.print("   " + Arry[0][0]);
                } else if (j == 0) {
                    Arry[i][j] = Arry[0][0];
                    System.out.print("   " + Arry[0][0]);
                } else {
                    Arry[i][j] = (Arry[i - 1][j] + Arry[i - 1][j - 1]);
                    System.out.print("  " + Arry[i][j]);
                }
            }
            System.out.println();
        }
    }
}
