package com.OverrideAndOverload;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

/**
 *@ClassName OverrideTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/26 13:56
 *@Version 1.0
 */
public class OverrideTest{

}

class Person{
    public static void main(String[] args) {
        Person person = new Person();

    }
    static int i = 1;
  public Person eat(){
        System.out.println("人会吃饭");
        Person.sleep();
        return new Person();

  }
    public static void sleep(){

    }
}

class Man extends Person{
    public static void main(String[] args) {
        int i = Man.i;
        System.out.println(i);
    }
    @Override
   public Man eat(){
        return new Man();
    }

}


