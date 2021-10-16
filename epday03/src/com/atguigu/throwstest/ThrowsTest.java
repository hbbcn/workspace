/**
 * @Title:ThrowsTest.java
 * @Package:com.atguigu.throwstest
 * @Description:TODO(一句话描述该文件做了什么)
 * @author:30988
 * @time:2021年5月24日下午12:58:34
 */
package com.atguigu.throwstest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *
 * 异常处理方法二，throws + 异常类型
 * 1."throws + 异常类型，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型
 * 时，就会被抛出，异常代码后续的代码就不会再执行。
 *
 * 2.体会：try-catch-finally:真正的将异常处理掉
 * 		throws的方式只是将异常抛给了方法的调用者，并没有真正的将异常处理掉
 *
 * 3.开发中，如何选择使用try-catch-finally,还是使用throws?
 *  		3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws,意味着
 *  			子类重写的方法中有异常，必须使用try-catch-finally方式处理。
 * 			3.2 执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws的方式进行处，
 * 				而执行的方法a可以考虑使用try-catch-finally
 *		抛出异常 ：throw 异常的生成阶段：手动抛出异常声明对象。
 *		声明异常 ：throws 异常的处理方式：声明方法可能要抛出的各种异常类
 */
public class ThrowsTest {


    public static void main(String[] args) {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException {

        method1();

    }

    public static void method1() throws FileNotFoundException, IOException {


        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();
        }

        fis.close();

        System.out.println("hello");
    }
}
