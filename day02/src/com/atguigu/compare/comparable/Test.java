package com.atguigu.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/27 9:12
 *@Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees("ZSD", 23));
        list.add(new Employees("AS", 13));
        list.add(new Employees("AS", 33));
        list.add(new Employees("CSA", 43));
        list.add(new Employees("DSE", 53));
        list.add(new Employees("DSD", 53));
        list.add(new Employees("DSF", 53));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}


