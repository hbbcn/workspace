/**
 * @Title:ExceptionTest2.java
 * @Package:com.atguigu.error
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年5月19日下午10:17:21
 * 
 */
package com.atguigu.error;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hamcrest.Condition;
import org.junit.Test;

public class ExceptionTest2 {

	
	@Test
	public void test2() {
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			 fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}
		
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("niao ");
	}

	@Test
	public void test1() throws Exception {

		String[][] arr = new String[10][];
		String[] arr1 = new String[2];
		String[] arr2 = {"2", "3"};
	}
	
}
