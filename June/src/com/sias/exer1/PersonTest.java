/**
 * @Title:PersonTest.java
 * @Package:com.sias.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月26日下午6:02:26
 * 
 */
package com.sias.exer1;

import com.sias.exer.Person1;

public class PersonTest {
	
	public int n = 10;

	public static void main(String[] args) {
		Person1 p = new Person1();
		
		 test  e = new test();
		
		
		new test1().exer1();
		
		
	}
}

class test{
	public void exer() {
		System.out.println("你好");
		
	}
}

class test1{
	
	
	public void exer1() {
	
		test t = new test();
		t.exer();
		System.out.println();
	}
	
	public void exer2() {
		
	}
}