package com.atguigu.devTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.atguigu.devTest
 * @Author: huang.qingbin
 * @CreateTime: 2023/1/12 11:00
 * @Description: TODO
 * @Version: 1.0
 */
public class Apple extends Fruits {

    String a = "Banana";

    public Apple(String a) {
        this.a = a;
    }
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<String>(10);
        arrayList.add("345");
        list = arrayList;
        System.out.println(list);

        List<Apple> apples = new ArrayList<Apple>();

        apples.add(new Apple("aaa"));
        List<? extends Fruits> fruits = apples;
        Fruits fruits1 = fruits.get(0);
//        Fruits a = fruits.get(2);
        System.out.println(fruits);
        List<Bnana> bana = new ArrayList<>();

//        fruits = bana;
        List<? super Fruits> apples1 = new ArrayList<>();

//        apples1 = apples;
        apples1.add(new Apple("111"));
        apples1.add(new Fruits(1));

        System.out.println(apples1);

        List<Apple> fruits11 = new ArrayList<>();
        List<? super Apple> apples11 = fruits11;


    }

    @Override
    public String toString() {
        return "Apple{" +
                "a='" + a + '\'' +
                ", a=" + a +
                '}';
    }
}
