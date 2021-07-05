/**
 * @Title:Man.java
 * @Package:com.guigu.polymorphism
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午7:22:25
 * 
 */
package com.guigu.polymorphism;

public class Man extends Person {

	boolean isSmoking;
	
	public void earnMoney() {
		
		System.out.println("男人负责挣钱");
	}
	
	public void eat() {
		System.out.println("男人多吃饭");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("男人跑步");
	}
}
