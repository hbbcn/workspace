
package com.atguigu.array;
/*
 * 数组元素替换
 */
import java.util.*;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// todo auto-generated method stub
		int arry[][];
		arry = new int[][] { { 1, 3 }, { 3, 4 } };
		int arry1[] = new int[] { 3, 4, 5 };
		ArrayDemo2 test = new ArrayDemo2();
		test.p1(arry1);
		
		System.out.println("arry1[0]= " + arry1[0]);
		System.out.println(arry[0]);
		System.out.println(arry);

		System.out.println(arry[0][0]);
		
		System.out.println(Arrays.toString(arry1));
		
		arry1[0] = 6;
		System.out.println("arry1[0] = " + arry1[0]);
		
	}
	public void p1(int []arry1) {
		
		int temp = arry1[1];
		arry1[1] = arry1[0];
		
		arry1[0] = temp;
	}

}
