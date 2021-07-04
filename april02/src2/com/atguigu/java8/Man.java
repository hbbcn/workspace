/**
 * @Title:Man.java
 * @Package:com.atguigu.java8
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月17日下午9:34:02
 * 
 */
package com.atguigu.java8;


interface Filial{
	default void help() {
		System.out.println("老妈我来救你了");
	}
}

interface Spoony {
	default void help() {
		System.out.println("媳妇，别怕，我来了");
	}
}


class Father{
	
	public void help() {
		System.out.println("儿子，救我媳妇");
	}
}
class Man extends Father implements Filial, Spoony{

	@Override
	public void help() {
		System.out.println("我该救谁呢");
		Filial.super.help();
	}
	
}

