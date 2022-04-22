package com.test;
/**
 *@ClassName A
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/15 19:27
 *@Version 1.0
 */
public class A{

    @Override
  public String toString(){
      return "hello" + this.toString();
  }

    public static void main(String[] args) {

        System.out.format("%s|%s\n",1,2,3);
        System.out.format("%s",2);
        System.out.format("%s%n","王先生");
        System.out.println("\\n");
        System.out.println("dshf\0sdfsd");

        System.out.println("\"");
//        System.out.print("\n");
        System.out.println("\r232");

    }

    public static String noticeTime(String deadline, String time,String[] starts) {

        return null;
    }
}

