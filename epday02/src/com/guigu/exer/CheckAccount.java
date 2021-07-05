/**
 * @Title:CheckAccount.java
 * @Package:com.guigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午5:53:59
 * 
 */
package com.guigu.exer;
/*
 * 在账户定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法，其算法如下；
			 * 如果（取款金额<账户余额）
			 * 可直接取款
			 * 否则计算需要透支的金额
			 * 判断可透支金额overdraft是否足够支付本次透支需要
			 * 		如果可以将账户余额修改为0，冲减可透支金额
			 * 如果不可以
			 * 		提示用户超过可透支的限额
			 * 
 * 
 */
public class CheckAccount extends AccountExer {

	
	
	private double overdraft;
	

	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id,balance,annualInterestRate);
		this.overdraft = overdraft;
		
		// TODO Auto-generated constructor stub
	}




	public double getOverdraft() {
		return overdraft;
	}




	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}




	public void withdraw(double amount) {
		if(amount <= getBalance()) {
					
			super.withdraw(amount);
			
		}
		else if(overdraft >= amount - getBalance()) {
			
			overdraft -= amount -getBalance();
//			setBalance(0);
			//或
			super.withdraw(getBalance());
		}
		else
			System.out.println("超过可透支额度");
	}
	
	
}
