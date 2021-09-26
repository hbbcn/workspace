package com.atguigu.generic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName Order
 *@Description  TODO
 * 自定义泛型类
 *@Author HuangQingbin
 *@Date 2021/6/21 12:02
 *@Version 1.0
 */
public class Order<T> {

    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型

    T orderT;

    public Order() {
    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;

    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    //静态方法中不能使用类的泛型。
 /*   public static void show(T orderT){
    System.out.println(orderT);
}*/


    //泛型方法：在方法中出现了泛型的结构，泛型参数与列的泛型参数没有任何关系。
    //泛型方法所属的类是不是泛型类都没有关系
    //泛型方法，可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非实例化确定的
//[public] [static] <T> 返回值类型 方法名(T 参数列表)
    public <T> List<T> copyFromArrayToList(T[] arr){

        ArrayList<T> list = new ArrayList<>();

        for(T e : arr){
            list.add(e);
        }
        return list;

    }




}

