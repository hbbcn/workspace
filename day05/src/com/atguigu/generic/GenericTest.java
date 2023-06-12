package com.atguigu.generic;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @ClassName generic
 * @Description 泛型的使用
 * 1.jdk 5.0 新增的特性
 * <p>
 * 2.在集合中使用泛型
 * 总结：
 * ①集合接口或集合类在jdk5.0时都修改为带泛型的结构。
 * ②在实例化集合列时，可以指明具体的泛型类型。
 * ③指明完以后，在集合列或接口中凡是定义类或接口时，内部结构使用到类的泛型的结构，
 * 都指定为实例化以后的泛型
 * 比如：add(E e) --->实例化以后：  add(Integer e)
 * 注意点：泛型的类型必须是类，不能基本数据类型。需要用到基本类型的位置。需要用到基本数据类型的位置，拿到包装类在替换
 * ⑤如果实例化，没有指明泛型的类型。默认类型为java.lang.object类型
 * <p>
 * 3.如何定义自定义泛型类
 * @Author HuangQingbin
 * @Date 2021/6/19 17:57
 * @Version 1.0
 */
public class GenericTest {

    public static void main(String[] args) {
//        消费型函数式接口 d为Double类型 有一个参数，没有返回值
        test11(d -> System.out.println(d.hashCode()));
//         函数型函数式接口  参数integer为Integer类型，返回类型为Integer 有一个入参T类型，和一个返回值R类型
        test12(integer -> {
            return integer + 1;
        });
//         断言型函数式接口 参数为integert 类型为Integer,通过参数调用含有的方法，返回值为boolean类型
        test13(integer -> integer.equals(3));
//         供给型函数式接口 没有参数，有返回值Integer
        test14(() -> 1 + 2);
    }



    public static void test11(Consumer<Double> dd) {
        dd.accept(1d);
    }

    //    函数型函数式接口
    public static void test12(Function<Integer, Integer> fun) {
        Integer apply = fun.apply(2);
        System.out.println(apply);
    }

    //     断言型函数式接口
    public static void test13(Predicate<Integer> fun) {
        boolean test = fun.test(3);
        boolean test1 = fun.test(4);
        System.out.println(test);
        System.out.println(test1);
    }

    //   供给型函数式接口
    public static void test14(Supplier<Integer> fun) {
        Integer integer = fun.get();
        System.out.println(integer);
    }


    //集合中使用泛型之前的情况：
    @Test
    public void test1() {
        ArrayList list = new ArrayList();

        //需求：存放学生的成绩
        list.add(28);
        list.add(38);
        list.add(90);
        list.add(10);
        //问题一：类型不安全
//        list.add("Tom");
        //方式一
//        for(Object score : list){
//            //问题二：强制转换时，可能出现ClassCastException
//            int stuScore = (Integer)score;
//        }

        //方式二
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }


    }

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(23);
        list.add(2);
        list.add(34);
        list.add(43);
        //编译时，就会机械能类型检查，保证数据的安全

        for (Integer score : list) {
            //避免强制转换操作
            int stuScore = score;
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test3() {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom", 45);
        map.put("Jerry", 80);
        map.put("Jack", 67);

//        map.put(45,"jdf");
        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> e = iterator.next();
            System.out.println(e.getKey() + "--->" + e.getValue());
        }

    }

    @Test
    public void test4() {
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1, 2, 3, 4};
//        List<Integer> list = order.copyFromArrayToList(arr);
//        System.out.println(list);


    }


}

