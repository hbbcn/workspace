package com.atguigu.exer;

//查找：线性查找
import java.util.*;
public class ArrayTest2 {

	
	public static void main(String[] args) {
		/*
		 * int []arry = new int[] {23,45,6,78,5,78}; int dest = 78; // dest = 99;
		 * boolean isFlag = true; for(int i = 0; i < arry.length; i++) { if( dest ==
		 * arry[i]) { System.out.println("你要找的数字索引i = " +i); isFlag = false; break;
		 * 
		 * 
		 * } }
		 * 
		 * if(isFlag) System.out.println("没有你要找的数");
		 */
//二分法查找
		
		
		int arry[] = new int[] { 1, 4, 5, 24, 32, 35, 45};
		int dest = 45;
		int head = 0, end = arry.length - 1;
		boolean flag = true;
		
//		int dest;
//		System.out.println("请输入你要找的数字");
//		Scanner reader = new Scanner(System.in);
//		dest = reader.nextInt();
		while (end >= head) {
			int middle = (end + head) / 2;
			if (dest == arry[middle]) {
				System.out.println("你要找的数的位置为" + middle);
				flag = false;
				break;
			} else if (end == head) {
				System.out.println("很遗憾没有你要找的数字");
				break;
			}

			else if (dest > arry[middle])
				head = middle + 1;
			else
				end = middle - 1;

		}
		if(flag)
		System.out.println("很遗憾找不到");

	}
}
