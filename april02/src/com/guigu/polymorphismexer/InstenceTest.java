/**
 * @Title:exer.java
 * @Package:com.guigu.polymorphismexer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月8日下午3:53:38
 * 
 */
package com.guigu.polymorphismexer;
/*
 * 建立InstanceTest 类，在类中定义方法method(person e);
 * 		在method中：
 * 		(1)根据e的类型调用相应的getInfo（）方法。
 * 		(2)根据e的类型执行
 * 		如果e为Person类的对象，输出
 * 		“a person”
 * 		如果e为Graduate类的对象，输出：
 * 		"a student"
 * 		"a person"
 * 		如果e为Graduate类的对象，输出：
 * 		“a graduated student”
 * 		"a student"
 * 		"a person"
 */
public class InstenceTest {

	
	public static void main(String[] args) {
		
		InstenceTest p1 = new InstenceTest();
		p1.method(new Student());
		
	}
	
	
	public void method(Person e) {
		
		e.getInfo();
		System.out.println(e.getInfo());
		if(e instanceof Graduate) {
			System.out.println("a graduated student");
			System.out.println("a student");
			System.out.println("a person");
		}else if (e instanceof Student) {
			System.out.println("a student");
			System.out.println("a person");
		}
		 System.out.println("a person");
	}
	
}


class Person{
	protected String name = "person";
	protected int age = 50;
	
	public String getInfo() {
		return "Name: " + name + "\n" + "age : " + age;
	}		
			
	}


class Student extends Person{
	protected String school = "pku";
	
	public String getInfo() {
		
		return "Name: " + name + "\nage : " + age +"\nschool " + school ;
	}
	
}

class Graduate extends Student{
	public String major = "IT";
	
public String getInfo() {
		
		return "Name: " + name + "\nage : " + age +"\nschol" + school + "\nImajor" + major;
	}
	
}




