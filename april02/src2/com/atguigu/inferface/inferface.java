/**
 * @Title:inferface.java
 * @Package:com.atguigu.inferface
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月15日上午10:40:44
 * 
 */
package com.atguigu.inferface;


	/*
	 * 接口的使用
	 *  1.接口的使用interface来定义
	 * 	2.JAV中，接口和类是并列的两个结构
	 * 	3.如何定义接口，定义接口成员
	 * 
	 * 		3.1 JDK7及以前：只能定义常量和抽象方法
	 * 			>全局常量：public static final的,但是书写时候可以省略不写
	 * 			>抽象方法：public abstract的 书写的时候也可也省略
	 * 
	 * 4.接口中不能定义构造器的！意为着接口不能实例化
	 * 
	 * 5.Java开发中，接口通过让类实现（implements)的方式来使用接口 
	 *	 重写所有抽象方法才可以实例化 否则需要抽象类
	 * 
	 * 6.Java类可以实现多个接口 ---》弥补了单继承性的局限性
	 * 	格式class AA extends BB implements CC,DD;
	 * 	
	 * 
	 * 7.接口与接口之间可以继承，而且可以是多继承
	 * 
	 * ***********************************
	 * 
	 * 8.接口的具体使用，体现多态性
	 * 9.接口，实际上可以看作是一种规范
	 */
public class inferface {
	
		public static void main(String[] args) {
			
			
			System.out.println(Flyable.MAX_SPEED);
			Plane p1 = new Plane();
			p1.fly();		
		
	}
	
}
	interface Attackable{
		
		void attack();
		
	}

	interface Flyable{
		
		
		//
		public static final int MAX_SPEED = 7900;//第一宇宙速度
		int MIN_SPEED = 1;//可以省略
		
		
		public abstract void fly();
		void stop();
		
		
	}


	class Plane implements Flyable{

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("通过机器飞");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("通过驾驶员飞");
			System.out.println(MIN_SPEED);
		}
		
		
		
	}

	class Bullet extends Object implements Flyable, Attackable, CC{

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
interface AA{
	
	void method1();
}
interface BB{
	
	void method2();
}

interface CC extends AA,BB{
	
}

