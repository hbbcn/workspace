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

import com.guigu.usethis.ThisExerGirl;

public class PersonTest {

	private Object test1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		PersonTest p3 = new PersonTest();
		
//		p1.setAge(12);
		
		System.out.println("年龄为: " + p1.getAge());
		
		
//		Person p2 = new Person("tom", 21);

		// System.out.println("name = " + p2.getName() + ", age = " + p2.getAge());
	}

	


}


