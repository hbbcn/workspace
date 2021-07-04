/**
 * @Title:exer3.java
 * @Package:com.atguigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月29日下午7:17:39
 * 
 */
package com.atguigu.exer;

public class exer3 {

	public static void main(String[] args) {
			test1 t = new test1();
			
			try {
				t.my(-1);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
				
			
	
	}
}


class test1{
	
	public void my(int i){
		
		if(i<0)
		throw new RuntimeException("小于0");
		
		System.out.println("年号");
		System.out.println("年号");
	}
}


