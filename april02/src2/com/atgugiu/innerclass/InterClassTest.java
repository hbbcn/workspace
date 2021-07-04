/**
 * @Title:InterClassTest.java
 * @Package:com.atgugiu.innerclass
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月17日下午10:55:18
 * 
 */
package com.atgugiu.innerclass;

import com.atgugiu.innerclass.Person.Bird;

/*
 * 类的成员之五：内部类
 * 
 * 1.Java中允许有一个类A声明在另一个类B中
 * 2.内部类的分类，成员内部类(静态，非静态）　vs　局部内部类（方法内，代码块内，构造器内）
 * 
 * 
 * 3.成员内部类
 * 		一方面，作为外部类的成员
 * 					》
 * 
 * 		另一方面，作为一个类
 * 					》类内可以定义属性，方法，构造器等
 * 					》可以被final修饰，表示此类不能被继承，言外之意，不使用final，就可以被继承
 * 					》可以被abstract修饰
 * 
 * 
 * 4.关注如下三个问题
 * 		4.1 如何实例化成员内部类对象
 * 		4.2 如何在成员内部类中区分调用外部类的结构
 * 		4.3 开放
 * 
 */
public  class InterClassTest {

	public static void main(String[] args) {
		
		//创建Dog实例(静态成员内部类）
		Person.Dog dog = new Person.Dog();
		dog.show();
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		bird.sing();
		bird.display("喜鹊");
	}
}

 class Person{
	
	
	String name = "斑鸠";
	int age;
	
	public void eat() {
		System.out.println("人，吃饭");
	}
	//静态成员内部类
	 static class Dog{
		
		String name;
		int age;
		
			public void show() {
			System.out.println("卡拉是条狗");
			
//			eat();
	}
	

	}
	//非静态成员内部类
		class Bird{
		
		String name = "杜鹃";
		public void sing() {
			System.out.println("我是一只小小鸟");
			Person.this.eat();
			
		
			
		}
		
		public void display(String name) {
			
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Person.this.name);
		}

		}
		
	public void method() {
		//局部内部类
		class AA{
			
		}
	}
	
	public Person() {
		//局部内部类
		class BB{
			
		}
		
	}
}