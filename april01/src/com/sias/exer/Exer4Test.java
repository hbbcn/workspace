package com.sias.exer;
//定义一个Student的类，包含三个属性，学号，年级，成绩
//创建20个对象，学号为1-20 年级和成绩都由随机数确定。
//问题打印出三年级的学生信息。
//问题二使用冒泡排序按学生成绩排序，并遍历学生信息

/**
 * @author HuangQingbin
 *
 */
public class Exer4Test {

	/*public static void main(String[] args) {
	 * 
	 
		// TODO Auto-generated method stub
		Student[] stus = new Student[20];
		
		for(int i = 0; i < stus.length;i++) {
			stus[i] = new Student();
			stus[i].number = (i+1);
			stus[i].state  =(int) (Math.random()*6) + 1;
			stus[i].score = (int) (Math.random()*100) + 1;
	}
		for(int i = 0; i < stus.length;i++) {
			System.out.println(stus[i].number + " " + stus[i].state + " " +  stus[i].score);
			System.out.println(stus[i].info());
		}
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length-1-i; j++ ) {
				if(stus[j].score > stus[j+1].score)
				{
					
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j + 1] = temp;
					
				}
				
				
				
				
					
				
		
				
			}
		}
		for (int i = 0; i < stus.length; i++)
			System.out.print(stus[i].score + " ");
}
}

class Student{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	public String info() {
		return "学号" + number + "年级" + state + "成绩" + score;
		
	}

*/
// 代码简化
	public static void main(String[] args) {
		 
		Exer4Test p1 = new Exer4Test();
		Student[] stus = new Student[20];
		
		int i[] = new int[] {12};
			// TODO Auto-generated method stub
		p1.Test(stus);
		p1.Test1(stus);
		System.out.println("******************");
		p1.Serch3(stus);
		p1.Test2(stus);
		
		
		System.out.println("******************");
		p1.Test3(stus);
		System.out.println("******************");
		p1.Test5(stus);
		System.out.println(stus);
		System.out.println((stus[0].number));
		}
		
		
			public void Test1(Student[] stus){
			
			for(int i = 0; i < stus.length;i++) {
//			System.out.println(stus[i].number + " " + stus[i].state + " " +  stus[i].score);
			System.out.println(stus[i].info());
			
		}
		}
		public void Test( Student[] stus) {
			for(int i = 0; i < stus.length;i++)
			{
			stus[i] = new Student();
			stus[i].number = (i+1);
			stus[i].state  =(int) (Math.random()*6) + 1;
			stus[i].score = (int) (Math.random()*100) + 1; 
	}
			
		
	
	}
		public void Serch3(Student[] stus) {
			System.out.println(stus[3].info());
		}
			
		public void Test2(Student[] stus) {
			for (int i = 0; i < stus.length - 1; i++) {
				for (int j = 0; j < stus.length-1-i; j++ ) {
					if(stus[j].score > stus[j+1].score)
					{
						
						Student temp = stus[j];
						stus[j] = stus[j+1];
						stus[j + 1] = temp;
						
					}
	
				}
			}
		}
	
		public void Test3(Student[] stus) {
			for (int i = 0; i < stus.length; i++)
				System.out.println(stus[i].info());
	}
//	打印年级为三的学生信息
		public void Test5(Student[] stus) {
			for(int i = 0; i < 20; i++) {
				if(stus[i].state == 3)
					System.out.println(stus[i].info());
			}
		}
		
}
class Student{
		int number;//学号
		int state;//年级
		int score;//成绩
		
		public String info() {
			
			return "学号" + number + "年级" + state + "成绩" + score;
			
		}
		
		Student b;
		
		
		
		
	}
	