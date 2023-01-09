package com.atguigu.compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/27 9:50
 *@Version 1.0
 */
public class Test{

  static Comparator<Employees>  comparator = new Comparator<Employees>() {
        @Override
        public int compare(Employees o1, Employees o2) {
            if (o1.name.compareTo(o2.name) == 0){
                return Integer.compare(o1.id,o2.id);
//                return o1.id - o2.id;

            }else {
                return o1.name.compareTo(o2.name);
            }

        }
    };
    public static void main(String[] args) {
        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees("ZSD", 23));
        list.add(new Employees("AS", 33));
        list.add(new Employees("AS", 13));
        list.add(new Employees("CSA", 43));
        list.add(new Employees("DSE", 53));
        list.add(new Employees("DSD", 53));
        System.out.println("排序前: "+list);
        Collections.sort(list, comparator);
//        System.out.println("排序后：" +list);
        list.stream().forEach(e->System.out.println(e.toString()));
    }





}

