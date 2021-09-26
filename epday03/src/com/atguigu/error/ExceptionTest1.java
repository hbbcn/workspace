/**
 * @Title:ExceptionTest1.java
 * @Package:com.atguigu.error
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月18日下午6:01:28
 * 
 */
package com.atguigu.error;

import org.junit.Test;

/*
 * 异常处理，抓抛模型
 * 
 * 过程一 "抛"， 程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
 * 并将对象抛出，一旦抛出对象以后，其后的代码就不再执行。
 *
 * 过程二："抓"，可以理解为异常处理的方式：@try-catch-finally  @throws
 * 
 * 
 * 二.try-catch-finally的使用
 * 
 * 
 * try{
 * 
 *    // 可能出现异常的代码 
 * }catch(异常类型1 变量1){
 * 
 * 		//处理异常的方式1
 * 
 * }
 *
 *catch(异常类型2 变量2){
 * 
 * 		//处理异常的方式2
 * 
 * }
 * .....
 *
 * finally{
 *  //一定会执行的代码
 *
 * }
 * 
 * 体会：使用try-catch-finally处理编译器异常，使得程序在编译时就不在报错，但是运行时仍然可能报错。
 *
 * //相当于我们使用try-catch-finally将一个编译时可能出现是异常，延迟到运行时异常
 * 
 * 1.finally是可选的
 * 2.finally中声明是一定会被执行的代码，即使catch中又出现了异常了，try中有return语句
 * catch中有return等情况
 * 3.像数据库连接，输入输出流 网络编程Socket等资源,JVM是不能自动回收的，我们需要自己手动的进行资源的释放。
 * 此时的资源释放，就需要声明在finally中
 * 3.常用的异常对象处理的方式.① String getMessage() ③ printStackTrace()
 * 体会：使用try-catch-finally处理编译异常，使得程序不在报错，但是运行时仍可能报错。
 * 相当于我们使用try-catch-finally将一个编可能出现的异常。
 * 体会2：开放中由于运行时异常比较常见，所以我们通常不针对运行时异常编写try-catch-finally
 * 		  针对于编写时异常，我们一定要考虑异常处理。
 * 
 */
public class ExceptionTest1 {

	@Test
	
	public void test() {
		int num  = method();
		System.out.println(num);
	}
	public int method() {
		

		try {
			int[] arr = new int[10];
//			System.out.println(arr[10]);
			
			return 1;
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return 2;
		}finally{
			System.out.println("你一定会执行");
			return 3;
		}
	}
	
	
	
	
	@Test
	public void test1() {
		
		String str = "123";
		str = "abc";

		
		try {
			
			int num = Integer.parseInt(str);
			
			System.out.println("hello----1");
		}catch(NumberFormatException e) {
			

			System.out.println(e.getMessage());
			System.out.println("异常");
//			e.printStackTrace();

		}
		
		catch(NullPointerException e) {
			System.out.println("出现数组转换异常，不要着急");
		}
		
		System.out.println("hello----2");
	}
	
	
	
	
}


