/**
 * @Title:CylinderTest.java
 * @Package:com.guigu.extendexer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日下午12:51:30
 * 
 */
package com.guigu.extendexer1;
//根据下图实现类。在CylinderTest类中创建类的对象，设置圆的地面半径和高，并输出原著的体积。
/*
 * 继承与父类的权限修饰符没有关系,当父类方法或者变量权限修饰符为private,不能通过子类直接调用
 * 但是可以在父类通过public方法调用
 * private,然后再通过子类调用Public 方法
 */

public class CylinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder cy = new Cylinder();
		 
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume();
		
		System.out.println("圆柱的体积为： " + volume);
//		cy.test();
		System.out.println("地面圆的面积：" + cy.findArea());
	}

}
