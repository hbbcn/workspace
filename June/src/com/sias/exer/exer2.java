/**
 * @Title:exer2.java
 * @Package:com.sias.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年6月12日下午2:25:18
 * 
 */
package com.sias.exer;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;






public class exer2{
	

	@Test
	public void test2(){
	
		Person2 p = new Person2();
		TreeSet set = new TreeSet();
//		set.add("aa");
//		set.add("cc");
//		set.add("bb");
		
//		set.add(34);
//		set.add(15);
//		set.add(19);
//		

		set.add(new Person2("Jack",15));
		set.add(new Person2("Tom",13));
		set.add(new Person2("Marry",21));
		set.add(new Person2("Boy",16));
		set.add(new Person2("Boy",12));
		
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		Integer b =10;
		int a = b;
		
	
	}
	
	
	
}
	
	
	
	

