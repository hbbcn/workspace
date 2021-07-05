
package com.atguigu.java;
import java.util.*;
/**
 * @ClassName:PersonTest
 * @Description:TODO(用一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月5日
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();// 创建Person类的对象
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
//		调用方法
		p1.eat();
		p1.sleep(1); 
		p1.talk("Chinese");
		System.out.println(p1.getNation("中国"));
		System.out.println(p1.getName());
				
		
		Person p2 = new Person();
		System.out.println(p2.name);
		Person p3 = new Person();
		p3.age = 1;
		
		int [] array  = new int[] {2,4,6,7,12,1,19};
		Arrays.sort(array);
		System.out.println(array[1]);
		
		
		
	}

}

class Person {
//	属性
	String name;
	int age = 1;
	boolean isMale;

// 方法
	public void eat() {
		System.out.println("人可以吃饭");
	}

	public void sleep(int hour) {
		System.out.println("休息了" + hour + "几个小时");

	}

	public void talk(String language) {
		System.out.println("人可以说话，使用的是：" + language);
		
	}
	
	public  String getName(){
		return name;
		
	}
	
	public String getNation (String nation) {
		String info = "我的国籍是" + nation;
		return info;
	}
	
//	Array类：sort() \ binarySearch()\ toString() \ equal()	
	

}

