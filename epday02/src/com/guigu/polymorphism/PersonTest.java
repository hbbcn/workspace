/**
 * @Title:PersonTest.java
 * @Package:com.guigu.polymorphism
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月7日下午7:28:22
 * 
 */
package com.guigu.polymorphism;
/*
 * 面向对象特征之三：多态性
 * 
 * 2.可以理解为一个事物多个形态
 * 
 * 对象多态性，父类的引用指向子类的对象
 * 3.多态的使用：虚拟方法调用
 * 		有了对象的多态性以后，我们在编译期，只能调用父类声明的方法，但在运行期间
 * 		我们实际上执行的是子类重写的方法
 * 4.多态使用的前提：1.类的继承关系。 2.方法的重写
 * 
 * 5.多态性的使用前提：只适用于方法不适用与属性
 * 
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
	//**************************************
		//对象多态性
		Person p2 = new Man();
		
		Person p4 = (Person)p2;//正确
	
		Person p3 = new Women();
		
		Person p5 = new Person();
		
		
		//多态的使用：当调用父类同名同参数的方法时，实际实行的是子类重写父类的方法---虚拟方法使用
		p2.eat();
		p2.walk();
		
		
		//不能调用子类所特有的方法，编译时，p2是Person
//		p2.earnMoney();
//		p2.earnMonry = ture
		
//		有了对象的多态性以后，内存中实际上加载了子类所特有的属性和方法，但是由于变量声明为父类类型导致
		//编译时只能调用父类的声明的属性和方法，子类特有方法不能调用
	
		//如何才能调用子类特有的方法和属性
//		向下转型：使用强制类型转换符
		Man m1 = (Man)p2;
		m1.earnMoney();
		m1.isSmoking = true;
		
		//1.编译时通过，运行时不通过
		//举例1
//		Person m3 = new Person();
//		
//		Man m4 =  (Man)m3;
//		m4.isSmoking = true;
//		m4.earnMoney(); 			 错误写法
		//举例二
//		Person p2 = new Man();
//		Women w1 = (Women)p2;
		
		
		
		//编译时通过，运行时也通过
		//
		Man m3 = new Man();
		Person m4 = (Person)m3;
		
		
		
		
//		使用强制转换时，可能出现ClassCastExcepion异常
		
		
		//instanceof关键字的使用(a instanceof b)
		//a为对象b为类。
		//目的是测试左边的对象是不是右边类的实列化
//		为了避免在向下转型出现异常，我们使用进行instanceof 的判断，一旦返回true 就进行向下转型，否则false
		
		if(p2 instanceof Women) //false
			{
			Women w1 = (Women)p2;
			w1.goShopping();
			System.out.println("*****Women******");
		}//
		
		if(p2 instanceof Man) {
			Man w1 = (Man)p2;
			w1.earnMoney();
			System.out.println("*****men******");
		}
		
		
		
		
		if(p2 instanceof Person)//true
		{
			System.out.println("*****Person******");
		}
		
		if(p5 instanceof Man)//false
		{
			System.out.println("*****Man******");
		}
		
		
	}
}
