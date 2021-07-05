/**
 * @Title:exer1.java
 * @Package:com.atguigu.abtract
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月13日下午3:23:24
 * 
 */
package com.atguigu.abtract;
/*
 * 1.abstract不能用来修饰，属性，构造器等结构
 * 2.abstract 不能用来修饰私有方法，静态方法，final的方法 final类
 * 
 * 
 * 
 * 
 */
public  abstract class Exer1 {

	private String name;
	private int id;
	private double salary;
	public Exer1() {
		super();
	}
	public Exer1(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
}

 class Manager extends Exer1{
	
	 
	 private double bonus;//奖金
	  public void work() {
		  
		  System.out.println("管理员工，提供公司的运行效率");
	  }
	
	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	  
	  
}
