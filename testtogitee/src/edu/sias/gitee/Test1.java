package edu.sias.gitee;

import java.util.Scanner;

/**
 *@ClassName Test1
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/24 22:34
 *@Version 1.0
 */
public class Test1{

   double d = 5.2;
    public static void main(String[] args) {

    }

   protected void testProtect(){

   }

   public void testPublic(){}


   private void testPrivate(){

   }

   public void Test1(){

   }

}


class AA{

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.testProtect();
    }

}




