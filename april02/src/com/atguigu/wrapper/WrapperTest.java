/**
 * @Title:w.java
 * @Package:com.atguigu.wrapper
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月10日下午9:44:01
 * 
 */
package com.atguigu.wrapper;

import org.junit.Test;

/*
 * 包装类的使用
 * 1.java提供了8种基本类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 
 * 2.掌握的：基本数据类型，包装类，String三者之间的相互转换
 * 
 * 
 * 
 */
public class WrapperTest {

	//String类型----》基本数据类型、包装类、调用包装类的parseXxx（）
	
	
@Test
public void test5() {
	
	String str1  = "123";
	int num2 = Integer.parseInt(str1);
	System.out.println(num2+1);
	
	String str2 = "true";
	boolean b1 = Boolean.parseBoolean(str2);
	System.out.println(b1);
}
	
	@Test
	//基本数据类型、包装类---》String 调用String重载的valueOf(Xxx xxx)
	
	public void test4() {
		
		//方式一
		int num1 = 10;
		String str1 = num1 + "";
		//方式2
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		System.out.println();
	//包装类----》String	
		double f2 = 12.4;
		Double d1 = new Double(f2);
		
		String str3 = String.valueOf(d1);
		System.out.println(str3.toString()); 
		
		System.out.println("***********");
		Float f3 = new Float(f1);
		
		System.out.println(String.valueOf(f3).toString());
		System.out.println(f3.toString());		
		System.out.println("***********");
		
		System.out.println(str2.toString());
//		System.out.println(str3);
	}
	
	
	/*
	 * JDK 5.0新特性， 自动装箱与自动拆箱
	 * 
	 */
	
	@Test
	public void test3() {
		
		int num1 = 10;
		
		method(num1);
		
		
		//自动装箱
		int num2 = 10;
		Integer in2 = num2;
		
		boolean b1 = true;
		Boolean b2 = b1;
		
		
		//自动拆箱
		
		int num3 = in2;
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	//包装类----》基本数据类型:调用包装类的xxxValue()
	@Test
	public void test2() {
		
		
			Integer in1 = new Integer(12);
			System.out.println(in1);
			System.out.println(in1 +  1);			
			int i1 = in1.intValue();
			
			Float f1 = new Float(12.3);
			float f2 = f1.floatValue();
			System.out.println(f2 + 1);
					
			
		}
	
	//基本数据类型----》包装类，调用包装类的构造器
	@Test
	public void test1() {
		int num1 = 10;
		
		Integer in1 = new Integer(num1);
		System.out.println(in1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		//Integer in3 = new Integer("123abc");//运行不通过
		
		System.out.println(in2);
		
		Float f1 = new Float(12.3f);
		Float f2 = new Float(12.3);
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		
		
		Boolean b3 = new Boolean("true123");
		
		System.out.println(b3);//false
		
		
		Order o1 = new Order();
		System.out.println(o1.isMale);
		System.out.println(o1.isFemale);//null
		
	}
}

class Order{
	boolean isMale;
	Boolean isFemale;
	
	
}
