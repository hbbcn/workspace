/**
 * @Title:test1.java
 * @Package:com.guigu.debugtest
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日下午1:32:58
 * 
 */
package com.guigu.debugtest;

public class Test1 {
public static void main(String[] args) {
	
	int i = 10;
	int j = 20;
	System.out.println("i = " + i + ", j = " + j);
	
	Test1 p1 = new Test1();
	int max = p1.getMax(i,j);
	
	System.out.println("max = " + max);
	
	
}

	private int getMax(int k, int m) {
		int max = 0;
		if(k < m) {
			max = k;
		}else
		{
			max = m;
		}
		
		return max;
	}

}
