package com.sias.exer3;
//函数的递归
public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionTest test = new RecursionTest();
		System.out.println(test.getSum(100));
		System.out.println(test.getMul(10));
		System.out.println(test.f(10));
		test.getMul(10);
		System.out.println(test.getSum1(3));
		int s[] = new int[] {2,6,3,4,7,24,45,12};
//		System.out.println(test. quick_sort(s));
	}
//例1	计算1到100的和
	public int getSum(int n) {
		if(n==1)
			return 1;
		else 
			return n + getSum(n-1);
	}
//例2	计算1到100的乘积
	public int getMul(int n) {
		if(n == 1)
			return 1;
		else {
			
			return n * getMul(n-1);
		}
		
	}
//	已知有一个数列，f(0) = 1, f(1) = 4; f(n+2）= 2*f(n+1) + f(n)
//	其中n是大于0的整数，求f(10)的值
	public int f(int n) {
	 
		if(n == 0)
			return 1;
		else if(n == 1) 
			return 4;
		else  
			return 2*f(n - 1)  + f(n - 2);
		
		
		
	}
//	例3 斐波那契数列
	public int getSum1(int n) {
		if(n == 1)
			return 1;
		else if(n == 2)
			return 1;
		else 
			return getSum1(n-1) + getSum(n-2);
		
	}
//	例4 汉诺塔问题
	
	
//	例5 快速排序
	
	public void quick_sort(int s[], int i, int j) {
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		
		
		
	}
//	public void sort(int []s, int start, int end){
//		if (start < end) {
//			int x = s[start]; 
//			int low = start;
//			int high = end;
//			while (true) {
//				while ( low < end && s[++low] - x <= 0)
//					;
//				while(high > start && s[--high] - x >= 0)
//					;
//				if (low < high) {
//					quick_sort(s, low, high);
//				}else
//					break;
//			} 
//			quick_sort(s, low, high);
//			
//		}
//		
//		
//			
//		
//	}
	
//	{
//	    if (l < r)
//	    {
//	        //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
//	        int i = l, j = r, x = s[l];
//	        while (i < j)
//	        {
//	            while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
//	                j--;  
//	            if(i < j) 
//	                s[i++] = s[j];
//	            
//	            while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
//	                i++;  
//	            if(i < j) 
//	                s[j--] = s[i];
//	        }
//	        s[i] = x;
//	        quick_sort(s, l, i - 1); // 递归调用 
//	        quick_sort(s, i + 1, r);
//	    }
//	}
//	
//	
	
}
