/**
 * @Title:OverrideTest.java
 * @Package:com.atguigu.throwstest
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月24日下午4:14:57
 * 
 */
package com.atguigu.throwstest;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 方法重写规则之一
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 * 
 * 
 */
public class OverrideTest {

	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		
		test.display(new SubClass());
	}
	public void display(SuperClass s) {
		try {
			s.method();
		}catch(IOException e){
			e.printStackTrace();
		}
	
}
}

class SuperClass{
	
	public void method() throws IOException {
		
		
	}
}

class SubClass extends SuperClass{
	public void method() throws FileNotFoundException{
		
	}
}