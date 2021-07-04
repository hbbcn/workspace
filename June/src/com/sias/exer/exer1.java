/**
 * @Title:exer1.java
 * @Package:com.sias.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月26日下午5:56:44
 * 
 */
package com.sias.exer;

public class exer1 {

	public static void main(String[] args) {
		xiaoming p  = new xiaoming();
		p.test();
		p.test1();
		
		
		
	}

	
}

interface Person{
	
	 public default void test() {
		 System.out.println("人吃饭");
	 }
	 public abstract void test1();

}
 
 class xiaoming implements Person{
	 
	 public void test2() {
		 System.out.println("小明吃饭");
	 }

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
 }