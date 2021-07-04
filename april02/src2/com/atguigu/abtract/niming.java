/**
 * @Title:niming.java
 * @Package:com.atguigu.abtract
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月25日下午8:10:54
 * 
 */
package com.atguigu.abtract;

public class niming {

	public static void main(String[] args) {
	
		
		BB p = new BB() {
			
		};
		
		AA p1 = new AA() {

			@Override
			public void test2() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		p1.test1();
		
		
		new AA() {
			public void test2() {
				// TODO Auto-generated method stub
				
			}
		};
				
				
			
		
		
		
	
		DD d = new DD();
		d.test3();
		
	}

	public static void method(AA a) {
		
	}
	
	
	
}

	
	
	
	  
	  



abstract class AA{
	
	public void test1() {
		
		System.out.println("你好");
	}
	
	public abstract  void test2();
		
	
		
	
}

 class BB extends AA{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
 
 
 interface CC{
	 public default void test3() {
		 
	 }
	 
	 public static void test4() {
		 
	 }
	 
	 public static int a = 0;
	 
	 public abstract void test5();
 }
 
 class DD implements CC{
	 
	 public void test5() {
		 System.out.println("dddd");
	 }
 }