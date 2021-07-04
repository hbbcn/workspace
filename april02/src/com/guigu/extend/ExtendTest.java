/**
 * @Title:ExtendTest.java
 * @Package:com.guigu.extend
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月5日下午11:10:05
 * 
 */
package com.guigu.extend;
/*
 * 
 * 面向对象的特征之二：继承性
 * 
 * 一、继承性的好处
 * 1.减少代码的冗余，提高代码的复用性
 * 2.便于功能的扩展
 * 3.为之后的多态性的使用。提供的前提
 * 
 * 二、Java中关于继承性的规定
 * 	1.一个类可以被多个子类继承
 *  2. 一个类只能由一个父类
 *  3.子父类是相对概念。
 *  4.子类直接继承的父类，称为，直接父类，间接继承的父类称为，间接欸父类
 *  5.子类继承父类以后，就获取了直接父类以及所有间接欸父类的属性和方法
 *  
 *  三、1.所有的java类（除了java.lang.Object类之外）都直接或间接继承于java.lang.Object类
 *  	2.意味着，所有的java类具有java.lang.Object类声明的功能。
 */

 
public class ExtendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
//		p1.age = 1;
		p1.eat();
		System.out.println("**********");
		
		Student s1 = new Student();
		s1.eat();
//		s1.sleep();
		s1.setAge(10);
		System.out.println(s1.getAge());
		
		Person p2 = new Student();
		
		Student p3 = (Student)p2;
		p3.eat();
		
	}
	

}
