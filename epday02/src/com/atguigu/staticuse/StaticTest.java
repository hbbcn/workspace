/**
 * @Title:StaticTest.java
 * @Package:com.atguigu.staticuse
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月11日下午6:23:08
 * 
 */
package com.atguigu.staticuse;
/*
 * static关键字的使用
 * 
 * 1.static:静态的
 * 2.static可以用来修饰：属性、方法、代码块和内部类
 * 
 * 3，使用static修饰属性:静态变量
 * 			3.1 属性按是否是使static修饰，分为，静态属性和非静态属性（实体变量）
 * 			实例变量：我们创建了类的多个对象，每个对象都独立拥有一套类的非静属性。
 * 
 * 			静态变量，我们创建的类的多个对象，多个对象共享一个静态变量，当通过某一个对象修改
 * 					其他对象调用此静态变量时，是修改过的。
 * 			
 * 			3.2 static修饰属性其他说明
 * 						① 静态变量随着类的加载而加载。可以通过"类.静态变量"方式进行调用
 * 						② 静态变量的加载要早于对象的创建
 * 						③ 由于类只会加载一次，静态属性也只会存在一份，存在方法区的静态域中
 * 					
 * 						 类变量   实例变量
 * 					类		yes		no
 * 					对象		yes		yes	
 * 
 * 					静态属性举例：System.out; Math.PI;
 * 
 * 4.使用static修饰方法
 * 		①随着类的加载而加载，可以通过“类.静态方法”的方式进行调用
 * 		1.1-->静态方法中，既可以调用静态方法和非静态方法
 * 		1.2-->静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 * 
 * 5.1 在静态的方法内，不能使用this 和super属性
 * 5.2 关于静态属性和静态方法的使用，大家都从生命周期的角度去理解：
 * 			
 * 6.开发中 如何确定一个属性是否要声明为static?
 * 			>属性可以被多个对象共享的，不会随着对象的不同而不同
 * 			>类中的常量也常常声明static
 *  开发中 如何确定一个方法是否要声明为static?
 *  		>操作静态属性的方法，通常设置为static
 *  		>工具类中的方法，习惯上声明为static的，比如 Math， Arrays
 */
public class StaticTest {
	

	public static void main(String[] args) {
		
		
		
		Chinese.nation = "中国";
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		
		c1.nation = "CHN";
		System.out.println(c2.nation);
		
		
		
	}
	
	
}
class Chinese{
	
	String name;
	int age;
	
	static String nation;
	static String school;
	
	
	public static void show(int b) {
		//静态结构不能调用非静态结构
		System.out.println("我是一个中国人" + b);
		
	
		
		}
	
	public void eat() {
		
	}
	
	
}
