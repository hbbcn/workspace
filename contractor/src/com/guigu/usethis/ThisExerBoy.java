package com.guigu.usethis;

public class ThisExerBoy {
	
	private String name;
	private int age;
	
	public ThisExerBoy(String n, int m) {
		name =n;
		age = m;
	}
	
	public void setName(String n) {	
		name = n;
		
}
	public String getName() {
		return name;
	}
	
	public void setAge(int i) {		
		age = i;		
	}
	public int getAge() {		
		return age;
	}
	
	public void test() {
		System.out.println("你好");
	}
	
	
	public void  marry(ThisExerGirl Girl) {
		
		System.out.println("我想娶" + Girl.getName() );
		
	}
	
	
	
	
	public void shout() {
		if(age >= 22) {
			System.out.println("你可以合法登记结婚了");
		}
		else {
			System.out.println(" 再谈几年恋爱 ");
		}
		
	}
}


