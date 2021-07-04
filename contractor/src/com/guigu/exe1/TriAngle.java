package com.guigu.exe1;
/*
 * 编写两个类TriAngle和TriAngleTest类声明私有的底边长base和高height。
 * 同时声明公共方法访问私有变量，
 */
public class TriAngle {

		private double base;//底边长
		private double height;//高
		
		
		public TriAngle(double n, double m) {
			base = n;
			height = m;
		}
		
		public void setBase(double b) {
			base = b;			
		}		
		public double getBase() {
			return base;
		}
		
		public void setHeight (double h) {
			height = h;
		}	
		public double getHeight() {
			return height;
		}
}
