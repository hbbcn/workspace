package edu.sias.gitee02;

/**
 *@ClassName Test03
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/23 20:41
 *@Version 1.0
 */
public class Test03{


    int i = 1;
    public static void main(String[] args) {

        Test03 test03 = new Test03();
        Test03 test031 = new Test03(1);

    }

    public Test03() {
        System.out.println("无参构造函数");
    }



    public Test03(int i) {

        System.out.println("有参构造函数");
    }

    static {
        System.out.println("静态代码块");

    }

    {
        System.out.println("构造代码块");
        System.out.println("###" + i);
    }
}

