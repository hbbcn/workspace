package com.atguigu.java8;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.atguigu.java8
 * @Author: huang.qingbin
 * @CreateTime: 2023/1/7 11:58
 * @Description: TODO
 * @Version: 1.0
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * java内置的4大核心函数式接口
 *
 * 消费型接口 Consumer<T>     void accept(T t)
 * 供给型接口 Supplier<T>     T get()
 * 函数型接口 Function<T,R>   R apply(T t)
 * 断定型接口 Predicate<T>    boolean test(T t)
 */

/* Consumer 消费型接口	T	void	对类型为T的对象应用操作，包含方法：void accept(T t)
   Supplier 供给型接口	无	T	返回类型为T的对象，包含方法：T get()
   Function<T, R>函数型接口	T	R	对类型为T的对象应用操作，并返回结果。结果是R类型的对象。包含方法：R apply(T t)
   Predicate断定型接口	T	boolean	确定类型为T的对象是否满足某约束，并返回boolean
        */

public class LambdaTest2 {

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }

    @Test
    public void test(){
        happyTime(30, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("熬夜太累了，点个外卖，价格为：" + aDouble);
            }
        });
        System.out.println("+++++++++++++++++++++++++");

        //Lambda表达式写法
        happyTime(20,mone -> System.out.println("熬夜太累了，吃口麻辣烫，价格为：" + mone));
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定

    public List<String> filterString(List<String> list, Predicate<String> pre){

        ArrayList<String> filterList = new ArrayList<>();
        for(String s : list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;

    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("长安","上京","江南","渝州","凉州","兖州");

        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("州");
            }
        });

        System.out.println(filterStrs);

        List<String> filterStrs1 = filterString(list,s -> s.contains("州"));
        System.out.println(filterStrs1);
    }
}

