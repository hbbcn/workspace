/**
 * @Title:Kids.java
 * @Package:com.guigu.extendexer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日上午7:00:04
 * 
 */
package com.guigu.extendexer;
/*
 * 定义类Kids继承ManKind，并包括成员变量int yearsOld;
 * 方法printAge()打印yearsOld的值
 */
public class Kids extends ManKid {
	private int yearsOld;
	
	
	


	public Kids(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge() {
		
		System.out.println("I am " + yearsOld +" years old");
		
		
	}
	
	public int GetYearOld() {
		return yearsOld;
	}
	
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	

}
