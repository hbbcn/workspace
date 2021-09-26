/**
 * @Title:AnimalTest.java
 * @Package:com.guigu.polymorphism
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午7:52:09
 * 
 */
package com.guigu.polymorphism;

import javax.security.auth.login.AccountNotFoundException;

//多态性的使用
public class AnimalTest {
	
	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		
		test.func(new Dog());
		
		test.func(new Cat());

		Animal dog = new Dog();
		Animal a = (Animal)dog;

//		Dog dog1 = (Dog) dog;
//		dog1.
	}

	
	
	
	
	public void func(Animal animal) {
		animal.eat();
		animal.shout();
		
	}
	
}


class Animal{
	
	public void eat() {
		
		System.out.println("动物，进食");
	}
	
	public void shout() {
		System.out.println("动物 叫");
	}

	public void sleep(){

	}

	
}
class Dog extends Animal{
	
	public void eat() {
		System.out.println("狗啃骨头");
	}
	
	public void shout() {
	
		System.out.println("汪！汪！汪！");
	}

	public void run(){

	}
}

class Cat extends Animal{
	
	public void eat() {
		
		System.out.println("猫吃鱼");
	}
	
	public void shout() {
		System.out.println("喵！喵！喵");
	}
}
