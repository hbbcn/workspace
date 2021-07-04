
// TODO 自动生成的方法存根

//				

// 对左边进行排序递归算法

//package com.sias.exer3;
//
//import java.util.Arrays;
//import java.util.*;
//
//public class QuickSort {
	
	
/*
	public static void main(String[] args) {

		int[] arr = { 5, 9, 7, 4, 8, 11, 6, 1, 10, 9, 20, 4 };
		
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		test(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

	public static void sort(int[] a) {
		if (a.length > 0) {
			sort(a, 0, a.length - 1);
		}

	}
	public static void test(int[] a) {
		if (a.length > 0) {
			
		}

	}

	public static void sort(int[] a, int low, int height) {
		int i = low;
		int j = height;
		System.out.println("i = " + i);
		System.out.println("low = " + low);
		System.out.println("height = " + height);
		System.out.println("j = " + j);
		System.out.println("**************");
		
		if (i >= j) {// 放在k之前，防止下标越界
			return;
		}
		int k = a[i];

		while (i < j) {
			while (i < j && a[j] > k) { // 找出小的数
				j--;
				
			}
//			System.out.println(">>>>>>>>>>>>>>>>>");
//			System.out.println(" i = " + j);
//			System.out.println(">>>>>>>>>>>>>>>>>");
			while (i < j && a[i] <= k) { // 找出大的数
				i++;
				
			}
//			System.out.println(">>>>>>>>>>>>>>>>>");
//			System.out.println(" i = " + i);
//			System.out.println(">>>>>>>>>>>>>>>>>");

			if (i < j) {// 交换
				int swap = a[i];
				a[i] = a[j];
				a[j] = swap;
			}

		}
//		System.out.println("中间的数据:"+a[low]);
		// 交换K
		k = a[i];
		a[i] = a[low];
		a[low] = k;
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println(" i = " + i + " height = " +height);
		 
		System.out.println(">>>>>>>>>>>>>>>>>");
		
		
		// 对左边进行排序,递归算法
		sort(a, low, i - 1);
		
		sort(a, i+1, height);
		
		
		// 对右边进行排序
//		System.out.println("i1 = " + i);
//		System.out.println("low1 = " + low);
//		System.out.println("height1 = " + height);
		
//		System.out.println("j1 = " + j);
//		System.out.println("**************");
		
		
		
		
	}
		
	
}
*/