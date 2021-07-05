/**
 * @Title:exer1.java
 * @Package:com.sias.exer1
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午10:45:51
 * 
 */
package com.sias.exer1;

  public class Bird extends Animal {
	  
	  public static void main(String[] args) {
		Bird b = new Bird();
	}

	public Bird() {
		System.out.println("Bird");
		
		
	}
}
 class Animal{
	
	public Animal () {
		System.out.println("Animal");
	}
}
