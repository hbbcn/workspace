/**
 * @Title:USBTest.java
 * @Package:com.atguigu.inferface
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月16日下午3:01:19
 * 
 */
package com.atguigu.inferface;
/*
 * 接口使用
 * 1.接口使用体现了多态性
 * 2.接口实际上就是一种规范
 * 3.开发中，体现面向接口编程
 * 
 * 
 */
public class USBTest {

	
		public static void main(String[] args) {
			
			Computer com = new Computer();
			
			//创建接口的非匿名实现类的匿名对象
			com.transferData(new Flash());
			
			
			//创建接口的匿名实现类的非匿名对象
			USB phone = new USB() {

				@Override
				public void start() {
					// TODO Auto-generated method stub
					System.out.println("手机开始工作");
				}

				@Override
				public void stop() {
					// TODO Auto-generated method stub
					System.out.println("手机结束工作");
				}
				
			};
			com.transferData(phone);
			
			//创建了接口的匿名实现类的匿名对象
			
			com.transferData(new USB() {

				@Override
				public void start() {
					// TODO Auto-generated method stub
					System.out.println("mp3开始工作");
				}

				@Override
				public void stop() {
					// TODO Auto-generated method stub
					System.out.println("mp3停止工作");
				}
				
			});
		}
}

class Computer{
	
	public void transferData(USB usb) {
		usb.start();
		
		System.out.println("具体传输细节");
		
		usb.stop();
		
		
		
		
	}
}
interface USB{
	
	void start();
	
	void stop();
	
}

class Flash implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("U盘开启工作");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("U盘结束工作");
	}
	
	public void test() {
		System.out.println("你好接口");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机结束工作");
	}
	
}