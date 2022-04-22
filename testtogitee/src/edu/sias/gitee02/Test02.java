package edu.sias.gitee02;

import edu.sias.gitee.Test1;

/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/23 20:02
 *@Version 1.0
 */
public class Test02 extends Test1 {

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.testProtect();
    }

    public void go(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        };
    }
}

class Test01 extends Test1{
    public static void main(String[] args) {
        Test01 test1 = (Test01) new Test1();



    }

    public void testPublic(){


    }




}

