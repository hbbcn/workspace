package com.hbb.strategy.improve;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Strategy
 * @Description TODO
 * @Author hqb
 * @Date 2022/4/5 16:54
 * @Version 1.0
 */
public class Strategy {

    public static void main(String[] args) {
        //数组
        Integer[] data = {9, 1, 5, 8, 3, 4};
        //实现升序，返回-1方左边，1放右边，0保持不变

        //说明
        //1.实现Comparator接口(策略接口)，匿名类对象new Comparator<Integer>(){..}
        //2.对象new Comparator<Integer>(){..} 实现策略接口的对象
        //3.public int compare(Integer o1, Integer o2){}指定了具体的处理方式
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };

        //说明
        /*
           public static <T> void sort(T[] a, Comparator<? super T> c) {
        if (c == null) {
            sort(a);
        } else {
            if (LegacyMergeSort.userRequested)
                legacyMergeSort(a, c);//使用策略对象
            else
                //使用策略对象c
                TimSort.sort(a, 0, a.length, c, null, 0, 0);
        }
    }
         */
        //方式1
        Arrays.sort(data, comparator);
        System.out.println(Arrays.toString(data));

        //方式2 使用lambda 表达式实现策略模式
        Integer[] data2 = {19,11,12,18,14,13};
        Arrays.sort(data2,(var1,var2) ->{
            if (var1.compareTo(var2) > 0){
                return 1;
            }else {
                return -1;
            }
        });
        System.out.println("data2 =" + Arrays.toString(data2));

    }


}

