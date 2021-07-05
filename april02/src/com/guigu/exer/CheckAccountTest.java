/**
 * @Title:CheckAccountTest.java
 * @Package:com.guigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午6:41:25
 * 
 */
package com.guigu.exer;

public class CheckAccountTest {
	public static void main(String[] args) {
		
		
		CheckAccount acct = new CheckAccount(1122, 20000,0.045,5000);
		
		acct.withdraw(5000);
		System.out.println("你的账户余额为：" + acct.getBalance());
		System.out.println("你的可透支额度：" + acct.getOverdraft());
		acct.withdraw(18000);
		System.out.println("你的账户余额为：" + acct.getBalance());
		System.out.println("你的可透支额度：" + acct.getOverdraft());
		acct.withdraw(3000);
		System.out.println("你的账户余额为：" + acct.getBalance());
		System.out.println("你的可透支额度：" + acct.getOverdraft());
		
	}

}

class test1{
	
}
