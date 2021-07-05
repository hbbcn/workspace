package com.java.test;
	import java.util.Scanner;
	
	public class Test1 {
		String name;
	    int age;

	    public Test1(String string) {
			// TODO Auto-generated constructor stub
		}

		public Test1() {
			// TODO Auto-generated constructor stub
		}

		public Test1(String string, int i) {
			// TODO Auto-generated constructor stub
		}

		public void  Test1 () {
	        System.out.println("Student()构造方法被调用");
	    }

	    public void  Test1 (String name) {
	        this.name = name;
	        System.out.println("Student(String name)构造方法被调用");
	    }

	    public void   Test1 (String name, int age) {
	        this.name = name;
	        this.age = age;
	        System.out.println("Student(String name, int age)构造方法被调用");
	    }

	    public static void main(String[] args) {
	    	 Test1  s1 = new  Test1 ();
	    	 Test1  s2 = new  Test1 ("张三");
	    	 Test1  s3 = new  Test1("李四", 15);
	    }

	}

			
	

