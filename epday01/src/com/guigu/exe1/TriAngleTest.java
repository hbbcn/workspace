package com.guigu.exe1;

public class TriAngleTest {
public static void main(String[] args) {
	
	TriAngle p1 = new TriAngle(3, 5);
//	p1.setBase(1.4);
	
	System.out.println("base = " +p1.getBase() + ", height = " + p1.getHeight());
	
	
	TriAngle p2 = new TriAngle(4, 5);
	System.out.println("base = " +p2.getBase() + ", height = " + p2.getHeight());
}
}
