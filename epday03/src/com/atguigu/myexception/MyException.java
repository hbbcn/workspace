/**
 * @Title:MyException.java
 * @Package:com.atguigu.myexception
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月24日下午7:56:26
 * 
 */
package com.atguigu.myexception;

import java.rmi.NoSuchObjectException;

/*
 * 如何自定义异常类
 *   1.继承于现有的异常结构，RuntimeException Exception
 *   2.提供全局常量
 *
 * 
 */
public class MyException extends RuntimeException {



	 static final long serialVersionUID = -7034897560745766939L;
	 
	 public MyException() {
		 
	 }
	 
	 public MyException(String msg) {
		super(msg);
	 }
}