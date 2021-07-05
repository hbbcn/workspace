/**
 * @Title:GeometricTest.java
 * @Package:com.guigu.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月8日下午5:27:00
 * 
 */
package com.guigu.exer1;

public class GeometricTest {

	public static void main(String[] args) {
		
			GeometricTest test = new GeometricTest();
			GeometricObject o1 =  new Circle(2.3, "white", 1.0);
			
			test.area(o1);
			
			GeometricObject o2 =  new Circle(3.3, "white", 1.0);
		
			test.area(o2);
			
			System.out.println(test.equalsArea(o1, o2));
			
			
	}
	
	
	
	public void area(GeometricObject o) {
		System.out.println("面积为： " + o.findArea());
	}
	
	public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
			return o1.findArea() == o2.findArea();
 			
		}
}
