package com.atguigu.generic;

import com.atguigu.exer.Person;

import java.util.Date;

/**
 *@ClassName Studnent
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/21 21:10
 *@Version 1.0
 */
public class Student extends Person {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(filterChinese("ewrfews黄规范4238709；??】的三个【。】【"));
    }

    /**
     * @Author huang.qingbin
     * @param  chin 过滤出中文
     * @return java.lang.String
     */
    public static String filterChinese(String chin)
    {
        chin = chin.replaceAll("[^(0-9)\\(\\u4e00-\\u9fa5)]", "");
        return chin;
    }


}

