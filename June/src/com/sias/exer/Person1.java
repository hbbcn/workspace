/**
 * @Title:Person.java
 * @Package:com.sias.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月26日下午5:57:34
 * 
 */
package com.sias.exer;

	public class Person1 {

		private int age;
		private String name;
		
		public Person1() {
			age = 18;
		}
		
		public Person1(String n, int a) {
			name = n;
			age = a;
		}
		
		public void setAge(int a) {
			if(a < 0 || a > 130) {
				System.out.println("传入数据非法");		
			}
			else 
				age = a;
		
		}
		public int getAge() {
			return age;
		}
		
//		public void setName(String name) {
//			this.name = name;
//		}
		
		public String getName() {
			return name;
		}
		
		
		
	}
	
	class test{
		public void show() {
			System.out.println("111");
		}
	}
	
	class test1 extends Thread{
	
		
	}


