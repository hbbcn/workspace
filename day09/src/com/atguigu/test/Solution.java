package com.atguigu.test;
/**
 *@ClassName Solution
 *@Description  TODO
 *@Author hqb
 *@Date 2022/1/10 18:31
 *@Version 1.0
 */
public class Solution {
    /**
     * 求解字符串最长子串的长度
     * @param s string字符串
     * @return int整型
     */
    public static void main(String[] args) {

        String s = "ohomm";
        int i = lengthOfLongestSubstring(s);
        int i2 = lengthOfLongestSubstring2(s);
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring (String s) {

        // write code here
        char[] chars = s.toCharArray();
        int leftPon = 0;
        int maxLen = 0;
        for (int i=0; i<chars.length; i++){
            for (int j = leftPon; j < i; j++){
                if (chars[i] == chars[j]){
                    maxLen = maxLen > (i - leftPon) ? maxLen : i - leftPon;
                    break;
                }
            }
        }

        if (maxLen < chars.length - leftPon){
            maxLen = chars.length - leftPon;
        }
        return maxLen;

    }

    public static int lengthOfLongestSubstring2(String s){

        int maxLength  = 0;
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        for (int j = 0; j < chars.length; j++){
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++){
                if (chars[innerIndex] == chars[j]){
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;

                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);

    }

    public static int lengthOfLongestSubstring3(String s){
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()){
            int pos = s.indexOf(s.charAt(i), flag);
            if (pos < i){
                if (length > result){
                    length = result;
                }
                if (result >= s.length() - pos - 1){
                    return result;
                }

                length = i - pos - 1;
                flag = pos + 1;

            }
            length++;
            i++;

        }
             return length;

    }

}

