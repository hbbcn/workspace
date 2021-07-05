/**
 * @Title:MyException.java
 * @Package:com.atguigu.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月29日下午2:07:13
 * 
 */
package com.atguigu.exer;

public class Exer1 {

	 public static void main(String[] args) {
		
		 Students s = new Students();
		 try {
			 s.regist1(-1);
			System.out.println(s);
		} catch (TooHigh e) {
		
			System.out.println(e.getMessage());
		}catch (TooLow e) {
			
			System.out.println(e.getMessage());
		}
	}
	
}

class Students{
	
 private int score;

	
	public void regist1(int score) throws TooHigh, TooLow{
		
		if(score >=0 && score <= 100) {
			this.score = score;
		}else if(score > 100) {
			throw new TooHigh("数据太大");
		}else {
			throw new TooLow("数据太小");
		}
			
		
		
		
		
		
		}
	
		

	@Override
	public String toString() {
		return "Students [score=" + score + "]";
	}
	
	

}

class TooHigh extends Exception{
	static final long serialVersionUID = -3387516693124229948L;

	
	 public TooHigh(){
		 
	 }
	 
	 public TooHigh(String Message) {
		 super(Message);
	 }
}

class TooLow extends Exception{
	
	static final long serialVersionUID = -3387515693124229948L;

	public TooLow() {
		
	}

	public TooLow(String message) {
		super(message);
	
	}
}


