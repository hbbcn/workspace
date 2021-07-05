/**
 * @Title:Person2.java
 * @Package:com.sias.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年6月12日下午4:09:47
 * 
 */
package com.sias.exer;

import java.util.Comparator;

import javax.management.RuntimeErrorException;

public class Person2 implements Comparable{

	 String name;
	 int age;
	 
	
	
	public Person2() {
		
	}
	
	public Person2(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
	
		if(o instanceof Person2) {
			Person2 p = (Person2)o;
//			return this.name.compareTo(p.name);
			if(this.name.compareTo(p.name) == 0) {
				return Integer.compare(this.age, p.age);
			}else {
				return this.name.compareTo(p.name);
			}
			
		}else {
			throw new RuntimeException("输入的数据异常");
		}
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		if(o1 instanceof Person2 && o2 instanceof Person2) {
//			Person2 p1 = (Person2)o1;
//			Person2 p2 = (Person2)o2;
//			return Integer.compare(p1.getAge(), p2.getAge());
//		}else {
//			 throw new RuntimeException("输入的数据异常");
//		}
//	}
//	
	


	
	
	
}
