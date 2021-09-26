/**
 * @Title:Extend.java
 * @Package:com.guigu.extend
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月5日下午10:44:43
 * 
 */
package com.guigu.extend;

public class Person {
	
	String name;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("吃饭");
		sleep();
	}
	
	private void sleep() {
		System.out.println("睡觉");
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		Person person = new Person();
		person.sleep();
	}
	
}
