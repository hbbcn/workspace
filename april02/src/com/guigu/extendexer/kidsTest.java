/**
 * @Title:kidsTest.java
 * @Package:com.guigu.extendexer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日上午8:00:08
 * 
 */
package com.guigu.extendexer;

public class kidsTest {
	public static void main(String[] args) {
		
		Kids someKid = new Kids(12);
		
		someKid.printAge();
		
		someKid.setSalary(0);
		someKid.setSex(1);
		someKid.employeed();
		someKid.manOrWoman();
	}

}
