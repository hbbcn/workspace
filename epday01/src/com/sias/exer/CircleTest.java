package com.sias.exer;
//计算圆的面积
public class CircleTest {
	public static void main(String[] args) {
		
//	创建对象
		Circle  p1 =  new Circle();
		
//	调用属性或者方法
	p1.radius = 10;	
	System.out.println(p1.findArea());
	int a = 3, b= 9;
	
	float n = (float)a/b;
	double c = (double)a/b;
	System.out.println(n);
	System.out.println(c);
	
	String str = new String("guigu");
	String str1 = new String("guiguq");
	
	System.out.println(str.equals(str1));
	
	System.out.println(p1.equals(p1));
	}
	

}


//定义类
class Circle{
	
//	属性
	float radius;
	
//	求圆的面积
	public double findArea() {
		
		double area = Math.PI*radius*radius;
		return area;
	}
}


