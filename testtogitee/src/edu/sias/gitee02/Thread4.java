package edu.sias.gitee02;
import static java.lang.Float.NaN;

/**
 *@ClassName Thread4
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/23 21:21
 *@Version 1.0
 */
public class Thread4{

    String a;
    public static void main(String[] args){
        new Thread4().go();
    }
    public void go(){
        Runnable r=new Runnable(){
            public void run(){
                System.out.print("foo");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }

    @org.junit.Test
    public void testNull(){
        System.out.println(NaN == NaN);
        String str = " ";
        String str1 ="";

        System.out.println(str == null);

        System.out.println(a == null);
        System.out.println(str1 == null);

    }


}

