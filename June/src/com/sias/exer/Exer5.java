/**
 * @Title:Exer5.java
 * @Package:com.sias.exer
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年6月13日下午10:29:50
 * 
 */
package com.sias.exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;



public class Exer5 {

	
	@Test
	public void test1() {
		Collection coll = new HashSet();
		coll.add("lily");
		coll.add("tom");
		coll.add("John");
		coll.add("Kevin");
		
		Collection coll1 = new HashSet();
		coll1.add("George");
		coll1.add("Rose");
		coll1.add("tom");
		coll1.add("Helena");
		
		//求并集
//		coll.addAll(coll1);
//		
//		for(Object obj : coll) {
//			System.out.print(obj + " ");
//		}
//	
		//求交集
		
//		coll.retainAll(coll1);
//		
//		for(Object obj : coll) {
//			System.out.println(obj);
//		}
		
		//求差集
		
		coll.removeAll(coll1);
		
		for(Object obj : coll) {
		System.out.println(obj);
	}
	
		
		
	}
	
	
	
	
}
