/**
 * @Title:Customer.java
 * @Package:com.atguigu.equals
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月9日下午4:49:12
 * 
 */
package com.atguigu.equals;

public class Customer {
	
	String name;
	int age;
	
	String a = "1234";
	String b = "1234";
	public boolean Test() {
		return a.equals(b);
	}
	
	
	public Customer() {
		super();
	}


	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj instanceof Customer) {
			Customer cust = (Customer)obj;
			
			if(this.age == cust.age && this.name.equals(cust.name)){
				
				return true;
			}else
				return false;
			
		}
		
		
		return false;
	}

	

}
