/**
 * @Title:test1.java
 * @Package:com.guigu.supertest
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日下午4:27:29
 * 
 */
package com.guigu.supertest;
/*
 * super关键字的使用
 * 1.super理解为，父类
 * 2.super可以用来调用，属性，方法，构造器
 * 
 * 3.super的使用
 * 
 * 		3.1 我们可以在子类的方法或构造器中，通过使用“super.属性”
 * 			或super.方法的方式，显示的调用父类中声明的属性或方法。但是
 * 			通常情况下，我们习惯省略“super”
 * 		3.2 特殊情况，当子类和父类中定义了同名的属性时，我们想要在子类中调用
 * 			父类声明的属性，则必须显示的使用super.属性的方式，表明调用的是父类
 * 			的属性
 * 		3.3 特殊情况下调用方法和属性一样
 * 		
 * 4.super来调用构造器
 * 		4.1 我们可以在子类的构造器中显示的使用"super(形参列表)"的方式，调用父类声明的指定构造器
 * 		4.2"super"的使用，必须声明在构造器的首行!
 * 		4.3 我们在类的构造器中，针对于“this（形参列表）”或“super（形参列表）”只能二选一，不能同时出现
 * 		4.4 在构造器首行没有显示的声明this和super，则默认的调用的是父类的空参的构造器
 * 		4.5 在类的构造器中，至少有一个类的构造器使用了super调用父类的构造器
 * 		
 * 
 */

public class test1 {
public static void main(String[] args) {
	
	Student p1 = new Student();
	p1.show();
	p1.study();
	
	Student p2 = new Student("Tom", 21, "IT");
	p2.show();
	
	
}
	
}
