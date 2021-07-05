/**
 * @Title:InterTest.java
 * @Package:com.atgugiu.innerclass
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月18日下午1:51:38
 * 
 */
package com.atgugiu.innerclass;

public class InterTest {

	public void method() {
		//局部内部类
		class AA{
			
		}
	}
	
	//返回一个实现了Comparable接口的类的对象
	public Comparable getComparable() {
		
		//创建一个实现了Compare接口的类：局部内部类
		//方式1
//		class Mycomparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		}
//		
//		return new Mycomparable();
		
		//方式2
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
	
}
