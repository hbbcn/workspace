package com.cn.math;

/**
 * @ClassName Hanoi
 * @Description TODO
 * @Author HuangQingbin
 * @Date 2021/7/16 17:06
 * @Version 1.0
 */
public class Hanoi {

    public static void main(String[] args) {

        System.out.println("*****************");
        System.out.println("*****************");
        hanio(2, "A", "B", "C");


    }

    static void hanio(int n, String a, String b, String c) {


        if (n == 1) {
            System.out.println(a + "---->" + c);
        } else {
            hanio(n - 1, a, c, b);
            System.out.println(a + "---->" + c);
            hanio(n - 1, b, a, c);

        }

    }
}
    //下面可以把汉诺塔的递归调用内部执行的顺序写出来 假设 n = 3;
//    static void hanio(int n, String a, String b, String c) {
//        if (n == 1) {
//            System.out.println(a + "---->" + c);
//        } else {
//
//            hanio(n - 1, a, c, b); //第一步因为n=3大于1 所以执行这一步
//            // 可以把 hanio(n-1,a,c,b ) 替换为
//            static void hanio ( int n, String a, String b, String c){
//                if (n == 1) { //此时因为 n-1 了 所以 n = 2;
//                    System.out.println(a + "---->" + c);
//                } else {
//
//                    hanio(n - 1, a, c, b); // n = 2 所以继续 调用此函数
//                    // 继续 把这个 hanio(n-1,a,c,b ) 替换为
//                    static void hanio ( int n, String a, String b, String c){
//
//                        if (n == 1) { //此时的n = 1; 所以直接执行if 这个条件
//                            System.out.println(a + "---->" + c);
//                        } else {
//                            hanio(n - 1, a, c, b);
//                            System.out.println(a + "---->" + c);
//                            hanio(n - 1, b, a, c);
//                        }
//                    }
//                            System.out.println(a + "---->" + c);
//                            hanio(n - 1, b, a, c);
//                        }
//                    }
//                }
//
//                    System.out.println(a + "---->" + c);
//                    hanio(n - 1, b, a, c);
//                }
//        }
//









/*
递归其实就是函数的嵌套，函数中不可以嵌套函数，但是可以调用函数

  可以这样理解递归 下面是三个不同的函数调用
  fun3(int n){  //函数3 假设n=3 n为局部变量在函数fun3()中n=3

         fun2(){ // fun3()调用函数2

                   fun1(){ //fun2()调用函数1

                        }

              }

  }
  //递归其实就是函数调用自身 可以把fun2() 和 fun1() 改成 fun3() 就是递归











  if(n == 1){
            System.out.println(a + "---->" + c);
        }else{
            hanio(n-1,a,c,b );
            System.out.println(a + "---->" + c);
            hanio(n-1,b,a,c);



 */


class Test2{
    public static void main(String[] args) {
        fun3(3);
    }
    static  void fun3(int n){
        fun2(n);//这一步的意思就是n现在这个值等于3，把3这个值赋值给a
                // 等价于fun2(3) 此时a就为3,你把a当初n是一样的,
                // 只不过正好和fun3()中的变量名称一样了，如果打印出来这两个的地址的话，
                //地址肯定不一样

        System.out.println("fun3()中n = " +n);
    }
    static  void fun2(int a){ //看这个我不n改成了a
        System.out.println();
        a = a + 1;
      System.out.println("fun2()中a = " + a);//先输出的值
    }
}