/**
 * @Title:Person.java
 * @Package:com.guigu.supertest
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日下午4:41:48
 * 
 */
package com.guigu.supertest;

public class Person {

	String name;
	int age;
	int id = 1001;
	
	public Person() {
		 
	 }
	
	public Person(String name) {
		this.name = name ;
	}
	
	public Person(String name, int age) {
		
		this(name);
		this.age = age;
	}
	
	public void eat() {
		System.out.println("人，吃饭");
	}
	
	public void walk() {
		System.out.println("人， 走路");
	}
}
