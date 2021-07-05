/**
 * @Title:exer1.java
 * @Package:com.atguigu.inferface
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月16日下午5:54:08
 * 
 */
package com.atguigu.inferface;

public class exer1 {

}

interface Playable{
	
	void play();
}

interface Rollable extends Playable{
	
	Ball ball = new Ball("Pingpang");
	
	
}
class Ball implements Rollable{

	 String name;
	
	public Ball(String name) {
		
		this.name = name;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
}