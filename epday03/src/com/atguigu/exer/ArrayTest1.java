package com.atguigu.exer;

//长度为6的int类型的数组要求数组元素的值都在1-30之间，且是随机赋值，要求各个元素的值都不同
import java.util.*;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] random = new int[6];
//		random[0] = (int) (Math.random() * 10);
//		for (int i = 0; i < 5; i++) {
//			random[i + 1] = (int) (Math.random() * 10);
//			boolean flag = true;
//			
//			while (flag) {
//				for (int n = 0; n < (i + 1); n++) {
//					if (random[n] != random[i + 1]) 
//						;
//						
//					else 
//					{
//						random[i + 1] = (int) (Math.random() * 10);
//						
//						n = -1; 
//					}	
//					
//				}
//				flag = false;
//
//			}
//
//		}
//
//		for (int j = 0; j < 6; j++)
//			System.out.print(random[j]);
//方法1
		/*
		 * int[] random = new int[6]; //random[0] = (int) (Math.random() * 7); for (int
		 * i = 0; i < 6; i++) { random[i] = (int) (Math.random() * 29 + 1);
		 */
		/*
		 * boolean flag = true; for (int j = 0; j < i; j++){ if(random[i] == random[j]){
		 * i--; flag = false; break; } }
		 */
// 方法2
		/*
		 * boolean flag = true;
		 * 
		 * while (flag) { for (int n = 0; n < (i + 1); n++) { if (random[n] != random[i
		 * + 1]) ;
		 * 
		 * else { random[i + 1] = (int) (Math.random() * 7);
		 * 
		 * n = 0; }
		 * 
		 * } flag = false;
		 * 
		 * } } for (int j = 0; j < 6; j++){ System.out.print(random[j]);
		 * System.out.print(" "); }
		 */

//方法3

		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 30 + 1);

			boolean flag = false;
			while (true) {
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						flag = true;
						
					}
				}
				if (flag) {
					arr[i] = (int) (Math.random() * 30 + 1);
					flag = false;
					continue;
				}

				break;

			}

		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
