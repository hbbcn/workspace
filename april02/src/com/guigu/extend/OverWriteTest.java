/**
 * @Title:OverWrite.java
 * @Package:com.guigu.extend
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月6日下午2:16:41
 * 
 */
package com.guigu.extend;
/*
 * 重写的规定
 * 			方法声明：权限修饰符 返回值类型 方法名（形参列表）{
 *			方法体					
 * }
 * 1.子类重写的方法名和形参列表与父类被重写的方法和参数列表相同
 * 2.子类重写的方法的权限修饰符不小于被重写的方法的权限修饰符
 * 			>特殊情况: 子类不能重写父类中声明为private权限的方法
 * 3.返回值类型
 * 			>父类被重写的方法的返回值类型是void，则子类重写的方法返回值
 * 类型只能是void
 * 			>父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值
 * 类型可以是A类或是A的子类
 * 			>父类被重写的方法的返回值类型如果是基本数据类型，则子类重写的返回数据类型
 * 必须是相同的数据类型
 * 			>子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的一场类型
 * **************************************************************
 * 			
 * 			子类和父类中同名同参的方法要么声明为非static（可以重写），要么声明为static（不是重写）
 * 面试题：区分方法的重载与重写
 * 
 * 
 */

	


class OverWrite {

	public Object info() {
		return null;
	}
	public void test() {
		System.out.println("你好");
	}
	
	
}
class OverWrite1 extends OverWrite {
//	
//	public Object info() {
//		return null;
//	}
	
	public String info() {
		return null;
	}
	
	public void test() {
		System.out.println("你好啊");
	}
}
public class OverWriteTest{
	
	public static void main(String[] args) {
	
		OverWrite p1 = new OverWrite();
		p1.test();
	}

}
