/**
 * @Title:CompareTest.java
 * @Package:com.atguigu.java8
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月16日下午8:35:49
 * 
 */
package com.atguigu.java8;

public class SubClassTest {
	
	public static void main(String[] args) {
		SubClass s = new SubClass();
	//s.method1
	//知识点1：接口定义的静态方法，只能通过接口来调用
	  CompareA.method1();
	  
	 //知识点2：通过实现类的对象，可以调用接口的默认方法
	  //如果实现类重写了默认方法，调用时，仍然调用是重写以后的方法
	  s.method2();
	  
	  //知识点3： 如果子类（或实现类）继承的父类和实现接口中声明了同名同参数默认的方法
	  //那么子类在没有重写此方法的情况下，默认使用的是父类中的同名同参数的方法---》类优先级
	  //知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法
	  //嫩么在实现类没有重写此方法的情况下 报错--》接口冲突
	  //这就需要我们必须在实现类中重写方法
	  s.method3();
	
	
	}
}

class  SubClass extends SuperClass implements CompareA{
	
	public void method2() {
		System.out.println("subclass: 上海");
	}
	
	public void method3() {
		System.out.println("subclass: 深圳");
	}	
	
	public void mymethod() {
		method3();//调用自己定义的重写方法
		super.method3();//调用的是父类中声明的方法
		CompareA.super.method2();//调用接口中的默认方法
	}
	
	
}