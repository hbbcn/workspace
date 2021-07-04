/**
 * @Title:Exer2.java
 * @Package:com.atguigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月29日下午2:58:21
 * 
 */
package com.atguigu.exer;

public class Exer2 {

	static	double  a = 5,b = 2,c = 0;
	public static void main(String[] args) {
		Car ca = new Car();
	    try {
			ca.spee(a, b, c);
		}catch(ArithmeticException e) {
			System.out.println("除数为0");
		}
	    catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

class Car{
	
	private double a, b, c;
	
	public void spee(double a, double b, double  c) throws Exception {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		if( c == 0) {
			throw new ArithmeticException();
		}else if(a*b < 0) {
			throw new Exception();
		}
		
}
}

