/**
 * @Title:CompareA.java
 * @Package:com.atguigu.java8
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月16日下午8:28:50
 * 
 */
package com.atguigu.java8;
/*
 * JDK8: 除了定义全局常量和抽象方法，还可以定义静态方法，默认方法
 * 
 * 
 * 
 */
public interface CompareA {

	//静态方法
	public static void method1() {
		System.out.println("compare : 北京");
	}
	
	//默认方法
	public default void method2() {
		System.out.println("compare: 上海");
	}	
	
	default void method3() {
			System.out.println("compare: 上海");
	}
	
}
