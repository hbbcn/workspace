/**
 * @Title:AccountExer.java
 * @Package:com.guigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午5:17:28
 * 
 */
package com.guigu.exer;
/*
 * 写一个名为Account的类模拟账户。该类的属性和方法如下图所示。该类
 * 包括账号id，余额balance，年利率 annuallnterestRate,包含方法，构造器
 * 等
 */
public class AccountExer {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	
	
	public AccountExer() {
		super();
	}

	public AccountExer(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//返回月利率
	
	public double getMonthlyInterest() {
		return getAnnualInterestRate()/12;
	}
	
	public void withdraw (double amount) {
		
		if(balance >= amount) {
			balance -= amount;
			return;
		}
		System.out.println("余额不足");
	}
	
	public void deposit(double amount) {
		
		if (amount > 0) {
			balance  += amount;
		}
	}
}
