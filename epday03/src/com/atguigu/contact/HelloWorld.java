package com.atguigu.contact;

import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		
	/*String str;
		Scanner reader=new Scanner(System.in);
		System.out.print("Please enter string: ");
		str=reader.nextLine();
		int i, n=str.length();
		int letterCount=0, numCount=0, otherCount=0;
		char ch;
		for(i=0; i<n; i++)
		{
			ch=str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				letterCount++;
			if(ch>='0'&&ch<='9')
				numCount++;
			else
				otherCount++;
		}
		System.out.println("Letter="+letterCount+"    Number="+numCount+"    Others="+(otherCount-letterCount));
*/


		int n, i;
		int number = 0;
		int chara = 0;
	    int other = 0;
	    char ch;
		String str;
		Scanner input  = new Scanner(System.in);
		str = input.nextLine();
		i = str.length();
		for (n = 0; n < i; n++)
		{
			ch = str.charAt(n);
			if((ch >= 'a'&&ch <= 'z')||(ch >= 'A'&&ch <= 'Z') )
				chara++;
			else if(ch >= '0'&&ch <= '9')
				number++;
			else 
			other++;
			
		}
		System.out.println("chara = " +chara);
		System.out.println(chara);
		System.out.println("number =" +number);
		System.out.println("other = " +other);
		
		
	}

	
}
