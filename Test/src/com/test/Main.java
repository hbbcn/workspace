package com.test;
import java.util.*;

/**
 *@ClassName Main
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/27 21:04
 *@Version 1.0
 */


class Solution {
    /* Write Code Here */
    public static void main(String[] args) {
        int[][] arr = new int[][]{{2,1,4},{4,5}};
        pathSum(arr);
    }
    public static int pathSum(int[][] array) {


    int length = array[0].length;
    int length1 = array.length;
        System.out.println(length);
        System.out.println(length1);

        return 1;

}
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int array_rows = 0;
        int array_cols = 0;
        array_rows = in.nextInt();
        array_cols = in.nextInt();

        int[][] array = new int[array_rows][array_cols];
        for(int array_i=0; array_i<array_rows; array_i++) {
            for(int array_j=0; array_j<array_cols; array_j++) {
                array[array_i][array_j] = in.nextInt();
            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }


        res = new Solution().pathSum(array);
        System.out.println(String.valueOf(res));

    }
}

