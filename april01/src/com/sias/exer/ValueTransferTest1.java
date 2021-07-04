package com.sias.exer;
//变量值的互换

public class ValueTransferTest1 {
	int m;
	int n;
	public static void main(String[] args) {

		// System.out.println("m = " + m + ", n = " + n);
		ValueTransferTest1 test = new ValueTransferTest1();
		
		test.m = 10;
		test.n = 20;
		
//		int m = 10;
//		int n = 20;
		test.swap(test);
		System.out.println("m = " + test.m + ", n = " + test.n);
//		Data data = new Data();
//		data.m = 10;
//		data.n = 20;
//		System.out.println("m = " + data.m + ", n = " + data.n);
//		data.swap(data);
//
//		System.out.println("m = " + data.m + ", n = " + data.n);
	}
//互换m, n的值
	public void swap(ValueTransferTest1 data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
//	public void swap(int m, int n) {
//	 int temp = n;
//	 n = m;
//	 m = temp;
	 
//	 return m + " " + n;
}

//}

//class Data {
//
//	
//	int m, n;
//	
//	
//	public void swap(Data data) {
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;
//		
//		
//		
//	}
//}
