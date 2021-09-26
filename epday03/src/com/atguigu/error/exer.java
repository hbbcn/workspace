/**
 * @Title:exer.java
 * @Package:com.atguigu.error
 * @Description:TODO(一句话描述该文件做了什么) 
 * @author:30988  
 * @time:2021年6月1日下午8:20:27
 * 
 */
package com.atguigu.error;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.junit.Test;

public class exer {
	
	

	 @Test
	    public void test3() throws UnsupportedEncodingException {
	        String str1 = "abc123中国";
	        byte[] bytes = str1.getBytes();//使用默认字符集进行编码
	        System.out.println(Arrays.toString(bytes));

	        byte[] gbks = str1.getBytes("gbk");//使用GBK字符集进行编码

	        System.out.println(Arrays.toString(gbks));


	        System.out.println("******************");
	        String str2 = new String(bytes);//使用默认字符集进行解码。
	        System.out.println(str2);

	        String str3 = new String(gbks);
	        System.out.println(str3);//出现乱码，原因：编码集和解码集不一致！

	        String str4 =  new String(gbks, "gbk");
	        System.out.println(str4);
	    }
}
