/**
 * @Title:exer3.java
 * @Package:com.sias.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年6月13日下午8:36:16
 * 
 */
package com.sias.exer;

import org.junit.jupiter.api.Test;

public class Exer3 {

	public static void main(String[] args) {
		Exer3 p = new Exer3();	
		System.out.println(p.countLetters("javaEE"));		
	}
	public static int countLetters(String s) {
		char arr[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {	
			 count++;		
		}
				
		System.out.println(s.length());//直接调用length()方法进行验证
		System.out.println("***************");
		return count;
	}
	
}
