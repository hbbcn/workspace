package com.test03;

import org.junit.Test;

import java.io.File;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.test03
 * @Author: hqb
 * @CreateTime: 2022/11/1 15:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        String dsf = new String("dsf");
        Class aClass = dsf.getClass();
        char ch = 'c';
        switch (ch) {
            case 'a':
                System.out.print("a"); break;
            case 'b':
                System.out.print("ab");
            case 'c':
                System.out.print("c");
            default:
                System.out.print("d");
        }
    }

    @Test
    public void test04(){
        for(int i=1;i<=10;i++){
            if (i<5)
                continue;
            System.out.println("Java基础班");
        }

        String s = "Gone with the wind";
        String stanfard = s.toUpperCase();
    }

    @Test
    public void test05(){
        Class<Integer> type = Integer.TYPE;
        String s = new String();

        int i = Integer.parseInt("23");
        int dfds = Integer.parseInt("dfds");

    }
}

