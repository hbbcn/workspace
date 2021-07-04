/**
 * @Title:Circle.java
 * @Package:com.guigu.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月8日下午5:16:22
 * 
 */
package com.guigu.exer1;

public class Circle extends GeometricObject {

	
	private double radius;

	

	public Circle(double radius,String color, double weight) {
		super(color, weight);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		
		return 3.14 * radius * radius;
	}
	
}

