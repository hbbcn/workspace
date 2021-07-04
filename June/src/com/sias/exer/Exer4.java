/**
 * @Title:Exer4.java
 * @Package:com.sias.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年6月13日下午9:04:46
 * 
 */
package com.sias.exer;

import org.junit.jupiter.api.Test;

public class Exer4 {

	public static void main(String[] args) {
		
	System.out.println(convertDecimalToBinary(123));
		
	}
	
	public static String convertDecimalToBinary(int value) {
		int t = 0;//用来记录位数
		int b = 0;
		int r = 0;
			
		while(value != 0) {
			
			r = value % 2;
			value = value / 2;
			b = (int) (b + r * Math.pow(10, t));
			t++;
		
		}
//		String str1 = b + " ";
		String str1 = String.valueOf(b);
		return str1;
		
	}
}


