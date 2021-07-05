/**
 * @Title:ErrorTest.java
 * @Package:april02
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月18日下午3:50:27
 * 
 */
package com.atguigu.error;

import org.junit.Test;

/*
 * Error：
 *  Java虚拟机无法解决的严重问题如JVM系统内部错误、资源耗尽等严重情况。比如 StactOverflowError
 * 
 *  一般不编写针对性代码进行处理
 *  
 *  
 *  Exception: 其他因编写错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理
 *  例如：空指针访问
 *  试图读取不存在文件
 *  网络连接中断
 *  数组角标越界
 *  
 *  
 *  异常
 *    1.编译时异常
 *    2.运行时异常
 */


//public class ErrorTest {
//
//	public static void main(String[] args) {
//		//栈溢出：java.lang.StactOverflowErro
//		
//		main(args);
//		
//		//堆溢出： java.lang.StackOverflowError
//		Integer[] arr = new Integer[1024 * 10241];
//	}
//}


public class ErrorTest{
	@Test
	public void test1() {
	
		
		String str = "abc";
		
		System.out.println(str.charAt(0));
		
		System.out.println(str);
		System.out.println("年后");
		
	}

}
