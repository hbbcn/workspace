
package com.guigu.usethis;

/**
 * @ClassName:ThisExerGirl
 * @Description:TODO(用一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月5日
 *
 */
public class ThisExerGirl{
	
	private String name;
	private int age;
	
	
	public ThisExerGirl() {
		super();
	}
	public ThisExerGirl(String n, int m) {
		name =n;
		age = m;
	}
	
	/**
	 * 
	 * @Title: setName
	 * @Description: TODO(用一句话描述这个方法的作用)
	 * @param @param i
	 * @return void
	 * @throws
	 */
	public void setName(String i) {
		
		name = i;
		
	}
	public String getName() {
		
		return name;
		
	}
	
	/**
	 * @Title: marry
	 * @Description: TODO(用一句话描述这个方法的作用)
	 * @param @param boy
	 * @return void
	 * @throws
	 */
	public void  marry(ThisExerBoy boy) {
		System.out.println(boy);
		System.out.println("我想嫁给" + boy.getName());
		boy.marry(this);
		boy.test();
	}
	
	public int compare(ThisExerGirl girl) {
		
		if(this.age > girl.age) {
			return 1;
		}else if(this.age < girl.age) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	
	
}