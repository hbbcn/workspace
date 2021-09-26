/**
 * @Title:ExceptionTest.java
 * @Package:com.atguigu.error
 * @Description:TODO(一句话描述该文件做了什么)
 * @author:30988
 * @time:2021年5月18日下午4:34:05
 *
 */
package com.atguigu.error;

import java.util.Scanner;

import org.junit.Test;

/*
 * 1.异常体系结构
 *|---- java.lang.Error:一搬不编写针对性代码进行处理
 *|---- java.lang.Exception:可以进行异常处理
 *
 *			|-----编译时异常(checked)
					|----IOException
						|--FileNotFoundException
					|----ClassNotFoundExceptioin
                
 *			|-----运行时异常(unchecked)
 *
 *					|----NullPointerException
 *					|----ArrayIndexOutOfBoundsException
 *					|----ClassCastException
 *					|----NumberFormatException
 *					|----InputMistmatchException 
 *					|----ArithmeticException
 * 
 * 
 */
public class ExceptionTest {







	/***************以下是运行时异常***************/


	//ArithmeticException

	@Test
	public void test6() {
              try {
                  int a = 10;
                  int b = 0;
                  System.out.println(a/b);

              } catch (Exception e) {
                  e.printStackTrace();
                  System.out.println("年后");
              }
          }



	//InputMistmatchException 输入不匹配

	@Test
	public void test5(){

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println(score);

		}


	//NumberFormatException

	@Test
	public void test4() {


//			String str = "123";
//			str = "abc";
//			Integer.parseInt(str);



	}


	//ClassCastException
	@Test
		public void test3() {
//	
//		Object obj = new Date(0);
//		String str = (String)obj;
	}
//	


	//ArrayIndexOutOfBoundsException
	@Test
	public void test2() {
//		int[] arr = new int[10];
//		System.out.println(arr[10]);

		//StringIndexOutOfBoundsException
		String str = "abc";
	System.out.println(str.charAt(4));
	}



	//NullPointerException
	@Test
	public void test1() {
//		int[] arr  = null;
//		System.out.println(arr[3]);
//	}

	String str = "abc";
	str = null;
	System.out.println(str.charAt(0));
	}
}
