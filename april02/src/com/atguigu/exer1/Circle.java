/**
 * @Title:Circle.java
 * @Package:com.atguigu.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月10日下午5:09:30
 * 
 */
package com.atguigu.exer1;



public class Circle extends GeometricObject1 {

	public double radius;

	public  Circle() {
		super();
		radius = 1.0;
//		color = "white";
//		weight = 1;
	
	}
	

	public Circle(double radius) {
		this.radius = radius;
	}


	public Circle(double radius, String color, int weight) {
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
		return 3.14*radius*radius;
	}
	
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return this.radius == c.radius;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
