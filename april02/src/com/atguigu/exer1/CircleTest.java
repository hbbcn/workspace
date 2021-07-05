/**
 * @Title:CircleTest.java
 * @Package:com.atguigu.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月10日下午5:33:26
 * 
 */
package com.atguigu.exer1;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(2.0,"red", 1);
		Circle c2 = new Circle(1.0,"green", 1);
		Circle c3 = new Circle(3.0);
		c1.equals(c2);
		
		System.out.println(c1.equals(c2));
		
		System.out.println("颜色是否相等" + c1.getColor().equals(c2.getColor()));
		
		System.out.println(c3);
		System.out.println(c3.toString());
	}
}
