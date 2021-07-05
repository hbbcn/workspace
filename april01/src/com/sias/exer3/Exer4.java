package com.sias.exer3;

import java.util.Arrays;
// 快速排序 递归的调用                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 

public class Exer4 {
	public static void main(String[] args) {
		int[] a = new int[] { 5, 8, 2, 9, 22,13,7,20, 11, 0, 1, 3, 4, 10, 4 };
		sort(a, 0, 14);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int[] a, int low, int height) {
		int i = low;
		int pow = a[i];
		int j = height;
		
		
		if(i>=j) {
			return;
		}
		while(i < j) {
			while(i < j) {
			if(a[j] < pow)
				break;
			else
				j--;
		}
		while(i < j) {
			if(a[i] > pow)
				break;
			else
				i++;
		}
		if(j > i) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;									
		}
		}
		
		
			int  swap = a[j];
			a[j] = a[low];
			a[low] = swap;
		
			
		
		
			sort(a, low, i-1);

			sort(a, i+1, height);

		

		

		

		}
	
	}




	

