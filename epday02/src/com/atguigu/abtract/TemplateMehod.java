/**
 * @Title:TemplateMehod.java
 * @Package:com.atguigu.abtract
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月14日下午6:33:29
 * 
 */
package com.atguigu.abtract;
/*
 * 接口的使用
 *  1.接口的使用interface来定义
 * 	2.JAV中，接口和类是并列的两个结构
 * 	3.如何定义接口，定义接口成员
 * 
 * 		3.1 JDK7及一切：只能定义常量和抽象方法
 * 			>全局常量：public static final的,但是书写时候可以省略不写
 * 			>抽象方法：public abstract的 书写的时候也可也省略
 * 
 * 4.接口中不能定义构造器的！意为着接口不能实例化
 * 
 * 5.Java开发中，接口通过让类实现（implements)的方式来使用接口 
 * 
 */
public class TemplateMehod {

	
	public static void main(String[] args) {
		
		
		System.out.println(Flyable.MAX_SPEED);
		Plane p1 = new Plane();
		p1.fly();
		
	
}
}

interface Flyable{
	
	
	//
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	int MIN_SPEED = 1;//可以省略
	
	
	public abstract void fly();
	void stop();
	
	
}


class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("通过机器飞");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("通过驾驶员飞");
	}
	
}



