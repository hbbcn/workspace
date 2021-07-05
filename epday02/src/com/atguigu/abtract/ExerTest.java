/**
 * @Title:ExerTest.java
 * @Package:com.atguigu.abtract
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月13日下午4:11:57
 * 
 */
package com.atguigu.abtract;

public class ExerTest {

	public static void main(String[] args) {
		
	
		Exer1 manager = new Manager();
		
		manager.work();
	}
}


abstract class test{
	public void test1(test m) {
		
		System.out.println(m);
	}
	
}