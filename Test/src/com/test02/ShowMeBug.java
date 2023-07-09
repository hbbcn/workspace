package com.test02;
/**
 * @ClassName ShowMeBug
 * @Description TODO
 * @Author hqb
 * @Date 2022/5/24 15:47
 * @Version 1.0
 */

/*
You have three positive integers represented as string s1, s2 and s3. you need to return their sum as string.
Example 1:
input: s1 = "5", s2 = "6", s3 = "7"
output: "18"
Example 2:
input: s1 = "1000", s2 = "10", s3 = "1"
output: "1011"
Example 3:
input: s1 = "9999999999999999", s2 = "1", s3 = "1"
output: "10000000000000001"
Constraints:
1 <= s1.length, s2.length, s3.length <= 100
do not use other library(eg. BigInteger)
*/

// 必须定义 `ShowMeBug` 入口类和 `public static void main(String[] args)` 入口方法
public class ShowMeBug {
    public static void main(String[] args) {
//System.out.println(sum("5", "6", "7"));
//     sum("5", "6", "7");
/*       System.out.println(sum("1000", "10", "1"));
        System.out.println(sum("9999999999999999", "1", "1"));*/
    }

    public static String sum(String s1, String s2, String s3) {
//        //todo
        int i = Integer.parseInt(s1);
        int i1 = Integer.parseInt(s2);
        int i2 = Integer.parseInt(s3);
        int sum = i1 + i2 + i;
        java.lang.String s = java.lang.String.valueOf(sum);
        return s;
    }
}

