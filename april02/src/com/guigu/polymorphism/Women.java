/**
 * @Title:Women.java
 * @Package:com.guigu.polymorphism
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午7:25:07
 * 
 */
package com.guigu.polymorphism;

public class Women extends Person{

	boolean isBeauty;
	public void goShopping() {
		System.out.println("女人喜欢购物");
	}
	
	@Override
	public void eat() {
		System.out.println("女人少吃， 为了减肥");
	}
	
	@Override
	public void walk() {
		System.out.println("女人走路");
	}
}
