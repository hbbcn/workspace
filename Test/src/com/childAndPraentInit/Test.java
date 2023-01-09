package com.childAndPraentInit;
/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/14 21:13
 *@Version 1.0
 */
public class Test{

    public static class A{
        protected static Integer num = 0;
        public A(){
            System.out.println("A构造函数，num = " + num++);
        }
        {
            System.out.println("A代码块，num=" + ++num);
        }
        static {
            System.out.println("A静态块，num=" + num++);
        }
        public void print(){
            System.out.println("A打印，num=" +num + new Float(1.0));
        }
    }

    public static class B extends A{
        public B(){
            System.out.println("B构造函数，num=" + num++);
        }
        {
            System.out.println("B代码块，num=" + ++num);
        }
        static {
            System.out.println("B静态块，num=" + num++);
        }
        public void print(){
            System.out.println("B打印，num = " + (num + new Float(1.0)));
        }
    }
    public static void main(String[] args){
        B b = new B();
        b.print();
    }
}

