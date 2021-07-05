/**
 * @Title:Proxyexer.java
 * @Package:com.atguigu.inferface
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月16日下午4:34:42
 * 
 */
package com.atguigu.inferface;

public class Proxyexer {

	
	public static void main(String[] args) {
		
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		
		proxyServer.browse();
		
		
	}
}

interface NetWork{
	
	public void browse();
}

//被代理类
class Server implements NetWork{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("真式的服务器访问网络");
	}
	
	
}

//代理类
class ProxyServer implements NetWork{

	
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	
	public void check() {
		
		System.out.println("联网之前的检查工作");
			
	}
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		
		check();
		
		work.browse();
		
		
	}
	
}
