/**
 * @Title:Cylinder.java
 * @Package:com.guigu.extendexer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日下午12:32:46
 * 
 */
package com.guigu.extendexer1;

public class Cylinder extends Circle{
	
	private double length;

	public Cylinder() {
		
		length = 1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	//返回圆柱的体积
	public double findVolume() {
//		return Math.PI * getRadius() * getRadius() * length;
		return findArea() * length;
	}
	
	
	

}
