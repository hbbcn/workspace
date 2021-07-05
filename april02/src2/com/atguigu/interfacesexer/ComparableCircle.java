/**
 * @Title:ComparableCircle.java
 * @Package:com.atguigu.interfacesexer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月16日下午6:07:39
 * 
 */
package com.atguigu.interfacesexer;

public class ComparableCircle extends Circle implements CompareObject {

	
	
	

	public ComparableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		
		
 	
		if (this == o) {
			return 0;
		}
		
		if(o instanceof ComparableCircle) {
			Circle c1 = (ComparableCircle)o;
//	//		return (int)(this.getRadius() - c1.getRadius();错误写法 当是小于1的小数的时候返回0
//			if(this.getRadius() < c1.getRadius()) {
//				return -1;
//			}else {
//				return 0;
//			}
//				
//		}
		
		return this.getRadius().compareTo(c1.getRadius());
		}
		else {
			return 0;
		}
		
	}

	
}
