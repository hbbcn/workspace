package com.atguigu.array;
import java.util.*;
//把学生的成绩进行分级 最高分-10为一个A级，最高分-20为B级
public class ArrayDmeo1 {

	public static void main(String[] args) {
		int []grade;
		int number = 0 ;
		int max = 0, m = 0;
		Scanner reader =  new Scanner(System.in);
		System.out.println("请输入学生人数:");
		number = reader.nextInt();
		grade = new int[number];
		int maxGrade;
		int score = 0;
		
		System.out.println("请输入每个学生的成绩");
		for(int  n = 0; n < number; n++) {		
			grade[n] = reader.nextInt();
		}
		
		for(int i = 0 ;i < number; i++) {
			if (score < grade[i]) {
				score = grade[i];
			}
				
		}
		
			



			
		 
		
	
		System.out.println("max = " +score);
		

	}

}
