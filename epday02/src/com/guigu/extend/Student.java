/**
 * @Title:Student.java
 * @Package:com.guigu.extend
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月5日下午11:04:33
 * 
 */
package com.guigu.extend;


public class Student extends Person {

//	String name;
//	int age;
	String major;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String major) {
		super();
		super.name = "dsf";
		this.name = name;
		setAge(age);
		this.major = major;
	}
	
//	public void sleep() {
//		System.out.println("睡觉");
//	}
//	
	public void eat () {
		System.out.println("吃饭");
	}
	
	public void study() {
		System.out.println("学习");
	}
	
//	public void eat() {
//		System.out.println("吃食物");
//	}
//	
	public void show() {
		System.out.println("name" + name + ", age :" +getAge());
	}

	public static void main(String[] args) {
		Student student = new Student();
			student.name="";
	}
}
