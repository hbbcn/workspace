package com.sias.exer1;

/*
 * 定义一个类PassObject ,在类中定义一个方法PrintAreas()
 * 该方法的定义如下：public void prinAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间每个整数半径值，以及对应的面积
 * 例如 time为5，则输出半径1，2，3，4，5以及对应圆的面积
 * 
 * 
 * 在main方法中调用printAreas()方法，调用完毕后输出当前半径值
 * 
 * 
 * 
 */
public class PassObject {
	
	public static void main(String[] args) {
		Circle1 c = new  Circle1();
		PassObject test = new PassObject();
		test.printAreas(c,5);
		System.out.println("Now radius is " +  c.radius);
	}
	
	public void printAreas(Circle1 c, int time) {
		
		System.out.println("Radius\t\tArea");
		
		
		for(int i = 1; i <= 5; i++) {
		c.radius = i;
		System.out.println(c.radius + "\t\t" + (double)c.findArea());
		}
		
		c.radius = time + 1;
		
	}
}
