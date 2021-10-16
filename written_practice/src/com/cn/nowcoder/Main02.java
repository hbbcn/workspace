package com.cn.nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *@ClassName Main
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/30 15:34
 *@Version 1.0
 */
public class Main02 {
    public static void toReverse(String str){
        List<Character> charList = new ArrayList<>();
        for(int i=str.length()-1; i>=0; i--){
            charList.add(str.charAt(i));
        }
        for(char result:charList) {
            System.out.print(result);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        toReverse(str);
    }

}

