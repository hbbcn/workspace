/**
 * @Title:MyRectangle.java
 * @Package:com.guigu.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月8日下午5:21:52
 * 
 */
package com.guigu.exer1;

public class MyRectangle extends GeometricObject {

	
	private double width;
	private double height;
	public MyRectangle(double width, double height,String color, double weight) {
		super(color, weight);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double findArea() {
		
		return width*height;
	}
	
	

	
	
}
