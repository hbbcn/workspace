/**
 * @Title:AccouyTest.java
 * @Package:com.atguigu.staticuse
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月12日下午12:52:47
 * 
 */
package com.atguigu.staticuse;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acct1 = new Account();
		Account acct2 = new Account("qwerty", 2000);
		
		Account.setInterestRate(0.012);
		Account.setMinMoney(100);
		System.out.println(acct2.toString());
		System.out.println(acct1.getInterestRate());
		System.out.println(acct1.getMinMoney());
	}
}
