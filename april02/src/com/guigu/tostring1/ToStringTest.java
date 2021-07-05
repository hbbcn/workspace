/**
 * @Title:ToStringTest.java
 * @Package:com.guigu.tostring
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月10日下午4:36:18
 * 
 */
package com.guigu.tostring1;
/*
 * Object类中toString()的使用
 * 
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象toString（）
 * 
 * 2.Object类中toSting（）的定义
 * 	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * 3.像String、Date、File，包装类等都重写了Object类中的toString方法
 * 使得调用对象方法的toString（）时，返回“实体内容”
 * 
 * 4.自定义类也可以重写toString（）方法
 */
public class ToStringTest {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom", 21);
		
		System.out.println(cust1.toString());
		System.out.println(cust1);
		
		
		String str = new String ("GG");
		System.out.println(str.toString());
		
		String a = "sjkn";
		System.out.println(a.toString());
		
	}
	
}

class Customer{
	
	String name;
	int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//		public String toString() {
//			
//			return "Customer[name = " + name +",age = " + age + "]";
//		}
//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", age=" + age + "]";
//	}
	
	}
	
	
	
	

