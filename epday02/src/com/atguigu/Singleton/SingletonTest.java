/**
 * @Title:SingletonTest.java
 * @Package:com.atguigu.Singleton
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月12日下午4:53:13
 * 
 */
package com.atguigu.Singleton;
/*
 * 单例设计模式：
 * 		1.所谓的单例设计模式，就是采取一定的方法保证整个的软件系统中，对某个类只能存在一个实体对象
 * 
 * 		2.如何实现
 * 		饿汉式 懒汉式
 * 
 * 3.如何区分懒汉式和饿汉式
 * 		饿汉式：坏处，对象加载实际过长
 *				好处 线程是安全的
 * 		懒汉式：好处：延迟对象的创建。
 * 				目前写法坏处，线程是不安全的---->到多线程内容再修改
 */
public class SingletonTest {

	public static void main(String[] args) {
//		Bank bank1 = new Bank(); 
		
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		System.out.println(bank1 == bank2);
	}
	
	
	
}

class Bank{
	//私有化的构造器
	private Bank() {
	}
	
	//2.内部创建类的对象
	
	//要求此对象必须是静态的
	private static Bank instance  = new Bank();
	
	//3.提供公共方法，返回类的对象
	
	public  static Bank getInstance() {
		return instance;
	}
}
