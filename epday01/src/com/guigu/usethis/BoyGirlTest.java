package com.guigu.usethis;

public class BoyGirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisExerBoy boy = new ThisExerBoy ("罗密欧",21);
		boy.shout();
		
		ThisExerGirl girl = new ThisExerGirl("朱丽叶", 18);
		
		ThisExerGirl girl1 = new ThisExerGirl("祝英台", 19);
		girl.marry(boy);
		
		girl.compare(girl1);
		 
		System.out.println(girl.compare(girl1));
	}

}
