/**
 * @Title:test.java
 * @Package:com.guigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午5:29:52
 * 
 */
package com.guigu.exer;
/*
 * 写一个用户程序测试Amount类，在用户程序中
 * 创建一个账户为1122、余额为2000、年利率为4.5%的Account对象。
 * 使用withdraw方法提款3000元，并打印余额。
 * 再使用withdraw方法提款2500元。
 * 使用deposit方法存款3000元，然后打印余额。
 * 
 * 
 */
public class test {

	public static void main(String[] args) {
		
		AccountExer acct = new AccountExer(1122, 20000,0.045);
		acct.withdraw(30000);
		System.out.println("你的账户余额为" + acct.getBalance());
		acct.withdraw(2500);
		System.out.println("你的账户余额为" + acct.getBalance());
		acct.deposit(3000);
		System.out.println("你的账户余额为" + acct.getBalance());
		
		
		System.out.println("月利率" + acct.getAnnualInterestRate());
		
		
	}
	
	
}

