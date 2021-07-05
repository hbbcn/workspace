/**
 * @Title:SingletonTest2.java
 * @Package:com.atguigu.Singleton
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月12日下午5:04:46
 * 
 */
package com.atguigu.Singleton;

public class SingletonTest2 {

	public static void main(String[] args) {
		
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		System.out.println(order1 == order2);
	}
	
	
	
}


class Order{
	//1.私有化类的构造器
	private Order() {
		
	}
	//2.声明当前对象，没有初始化
	private static Order instance = null;
	
	//3.声明public，static的返回当前对象的方法
	public static Order getInstance() {
		if (instance == null) {
			instance = new Order();
		}
		return instance;
				
	}
}