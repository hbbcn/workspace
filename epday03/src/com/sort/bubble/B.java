package com.sort.bubble;
/**
 *@ClassName B
 *@Description  TODO
 *@Author hqb
 *@Date 2022/1/7 16:01
 *@Version 1.0
 */
public class B extends A{

    public B(int i) {
        super(i);
    }

    public B() {
    }


    public static void main(String[] args) {
        int i = 2;
        print(i);
        System.out.println(i);

        Test test = new Test();
        test.f3();
    }


        public static void print(int i){
            i = i + 5;
            System.out.println(i);

    }

}

class Test {
    void f1() throws Exception {  }

    void f2() throws Error{ }

    void f3() throws RuntimeException{ }

    void foo(){
        f3();
    }

}
