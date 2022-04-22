package com.test.test01;

import javax.xml.transform.Source;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

/**
 *@ClassName A1
 *@Description  TODO
 *@Author hqb
 *@Date 2022/1/15 13:21
 *@Version 1.0
 */
public class A1{

  static int i;


    public int j = 1;

    public static void main(String[] args) {


        String name = "xiaoming";
//        name += "bb";

        String replace = name.replace("x", "d");
        System.out.println(name == replace);
        System.out.println(replace);
        char c = name.charAt(1);
        System.out.println(c);
        long round = Math.round(-10.5);
        long round1 = Math.round(-10.51);

        System.out.println(round1);


        System.out.println(round);


    }

   void test01(AA aa){

   }

   public static void test03(){

    }
}


