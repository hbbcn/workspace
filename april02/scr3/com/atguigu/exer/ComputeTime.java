/**
 * @Title:Exer3.java
 * @Package:com.atguigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月29日下午3:24:20
 * 
 */
package com.atguigu.exer;

public class ComputeTime {

	public static void main(String[] args) {
		 Car007 car = new Car007();
		 
		 double speed = car.speed(30, -12, 0);
		 System.out.println("该交通工具的运行速度为"+speed);
		 System.out.println("运行1000公里使用的时间为"+1000/speed);
	}
}

interface Common{
	double speed(double a, double b, double c) throws Exception;
	
}

class Plane implements Common{

	@Override
	public double speed(double a, double b, double c) throws Exception {
		if(a+b+c < 0) {
			throw new Exception();
		}else {
			return a + b + c;
		}
		
	}
	
}

class Car007 implements Common{

	@Override
	public double speed(double a, double b, double c) {
		
		return a*b/c;
	}
	
	
	
}