package com.sias.exer;

public class Exer3Test {
	public static void main(String[] args) {
				
		Exer3Test m = new Exer3Test();
		System.out.println(m.method(12, 10));
		
	}
	
//	public int method() {
//	方法1
//		for(int i = 0; i < 10; i++) {
//		for(int j = 0; j < 8; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	return 10*8;
//
//		方法2
	public int method(int m, int n)
	
		{
			
				for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			return m*n;
		}
		
	
}

