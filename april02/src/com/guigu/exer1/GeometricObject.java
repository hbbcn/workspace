/**
 * @Title:GeometricObject.java
 * @Package:com.guigu.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月8日下午5:10:34
 * 
 */
package com.guigu.exer1;

public class GeometricObject {

	
	public String color;
	public double weight;
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

	

	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	
	public double findArea() {
		return 0;
	}
	
}
