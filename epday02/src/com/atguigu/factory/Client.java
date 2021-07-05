/**
 * @Title:Car.java
 * @Package:com.atguigu.com
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月19日下午5:13:25
 * 
 */
package com.atguigu.factory;

interface Car{
	
	void run();
}


class Audi implements Car{
	@Override
	public void run() {
		System.out.println("奥迪在跑");
	}
}

class BYD implements Car{

	public void run() {
		System.out.println("比亚迪在跑");
	}
	
}

//工厂接口
interface Factory{
	Car getCar();
}
//两个工厂
class AudiFactory implements Factory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}
	
}

class BYDFactory implements Factory{

	@Override
	public Car getCar() {
		
		return new BYD();
	}
	
}

public class Client{
	
	public static void main(String[] args) {
	
		
		Car a = new AudiFactory().getCar();
		Car b = new BYDFactory().getCar();
		a.run();
		b.run();
	}
	
	
	
}
