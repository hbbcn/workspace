package com.sias.exer;

public class Exer1Test {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		double c = a / b;
		System.out.println(c);
		double d = (double) a / b;
		System.out.println(d);
		double n;

		n = 1 + 3;
		System.out.println(n);
	}
//编译失败
//		float f1 = 12.3 f1为double类型  所以精度大的不能向精度小的转
//	整型常量，默认类型为int型
//	浮点型常量默认类型为double型
	//byte b = 30;
//	byte b1 = b + 1；编译失败

}
