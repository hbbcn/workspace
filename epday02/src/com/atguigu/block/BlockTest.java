/**
 * @Title:BlockTest.java
 * @Package:com.atguigu.block
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月12日下午6:14:51
 * 
 */
package com.atguigu.block;
/*
 * 类的成员之四 代码块(初始化块）
 * 1.代码块作用：用来初始化类，对象
 * 2.只有静态代码块和非静态代码块
 * 3.静态代码块
 * 		>内部可以有输出语句
 * 		>随着类的加载而执行而且只会执行一次
 * 		作用：初始化类的信息
 * 		>如果一个类中定义了多个静态代码块，则按照声明先后顺序执行
 * 		>静态代码块执行要优于非静态
 * 		>静态代码块内只能调用静态的属性,方法不能调用非静态的
 * 
 * 4.非静态代码块
 * 		>内部可以有输出语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象就执行一次非静态代码块
 * 
 * 		作用：可以再创建对象时，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个代码块，则按照声明先后顺序执行
 * 		>静态代码块内只能调用静态的属性,方法不能调用非静态的
 * 
 *对属性可以赋值的位置：
 *①默认初始化
 *②显示初始化
 *③构造器中初始化
 *④有了对象以后，可以通过“对象.属性” 或“对象.方法”
 *⑤在代码块中也可以赋值
 * 
 */
public class BlockTest {

	public static void main(String[] args) {
		
		String desc = Person.desc;
	
		Person p1 = new Person();
		Person p2 = new Person();
		
	
	}
	
	
	
}

class Person{
	
	//属性
	String name;
	int age;
	static String desc = "我是一个人";
	
	//构造器
	public Person(){
		
	}
	
	public Person(String naem, int age) {
		this.name = name;
		this.age = age;
	}
	
	//代码块
	
	{
		System.out.println("hello, block");
	}
	
	static {
		Person person = new Person();
//		name = " ";
		System.out.println("hello, static block1");

	}
	
	static {
		
		System.out.println("hello, static block");
		desc = "我是一个爱学习的人";
		info();
	}
	
	
	
	//方法
	public void eat() {
		
	}
	
	public static void info() {
		
		System.out.println("我是一个快乐的人");
	}
}