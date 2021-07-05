/**
 * @Title:Student.java
 * @Package:com.guigu.supertest
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日下午4:42:00
 * 
 */
package com.guigu.supertest;

public class Student extends Person{

	String major;
	int id = 1002;
	
	public Student() {
		
	}
	
	public Student(String major) {
		
		this.major = major;
		
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
//		this.age = age;
//		this.name = name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("学生多吃有营养的食物");
	}
	
	public void study() {
		System.out.println("学生学习知识");
		eat();
		super.eat();
	}
	
	public void show() {
		System.out.println("name = " + name + ", age = " +age);
		System.out.println("id = " + id);
		System.out.println("id = " + super.id);
	}
}
