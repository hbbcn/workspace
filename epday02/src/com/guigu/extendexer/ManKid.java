/**
 * @Title:ManKid.java
 * @Package:com.guigu.extendexer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日上午7:12:43
 * 
 */
package com.guigu.extendexer;

public class ManKid {

	private int sex;//性别
	private int salary;//薪资
	
	public void manOrWoman() {
		if(sex == 1) {
			System.out.println("man");			
		}else if(sex == 0) {
			System.out.println("woman");
			
		}
}
	public void employeed() {
		String jobInfo = (salary == 0)? "no job" : "job";
		System.out.println(jobInfo);
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}