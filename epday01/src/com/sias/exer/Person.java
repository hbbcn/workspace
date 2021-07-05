package com.sias.exer;
/*
 * 1.创建程序，在其中定义两个类，Person和PersonTest类。定义如下
 * 用setAge()设置人的合法年龄（0~130),用getAge（）返回人的年龄。
 * 
 * 2
 * 2.1. 在前面的定义Person类中添加构造器，利用构造器设置所用的age
 * 属性初始值都为18.
 * 2.2 修改上题中类和构造器，增name属性，使得每次创建Person对象
 * 的同时初始化age属性值n和m
 */

public class Person {

	private int age;
	private String name;
	
	public Person() {
		age = 18;
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setAge(int a) {
		if(a < 0 || a > 130) {
			System.out.println("传入数据非法");		
		}
		else 
			age = a;
	
	}
	public int getAge() {
		return age;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}
	
}

	
	
