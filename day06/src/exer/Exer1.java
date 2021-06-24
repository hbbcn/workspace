package exer;

import org.junit.Test;

/**
 *@ClassName Exer1
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/22 19:56
 *@Version 1.0
 */
public class Exer1{
    @Test
    public void test1(){
        System.out.println((int)(Math.random()*10 + 1)*10);
}

@Test
    public void test2(){
    int  i=10, j=18, k=30;

    switch( j - i )

    {     case  8 :  k++;

        case  9 :  k+=2;

        case  10:  k+=3;

        default :  k/=j;

    }
    System.out.println(k);
}
}

