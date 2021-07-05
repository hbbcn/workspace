/**
 * @Title:Circle.java
 * @Package:com.guigu.extendexer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日上午8:25:28
 * 
 */
package com.guigu.extendexer1;

public class Circle {
	
	private double radius;//半径
	
	 public Circle() {
		 radius = 1.0;
	 }

	public double getRadius() {
		return radius;
	}
	
	private void test() {
		System.out.println("你好");
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//返回圆的面积
	
	public double findArea() {
		return Math.PI * radius * radius;
	}

	 
	 
}
