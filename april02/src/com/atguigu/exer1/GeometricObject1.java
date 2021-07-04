/**
 * @Title:GeometricObject.java
 * @Package:com.atguigu.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月10日下午5:06:48
 * 
 */
package com.atguigu.exer1;

public class GeometricObject1 {

	
	protected String color;
	protected int weight;
	
	
	
	public GeometricObject1() {
		this.color = "white";
		this.weight = 1;
	}



	public GeometricObject1(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}	
	

