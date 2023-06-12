package com.atguigu.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *@ClassName LamdbaTest
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/10 17:07
 *@Version 1.0
 */

/**
 * >如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口
 * >我们可以在一个接口上使用@FunctionLIntrface注解 这样可以检查它是否是一个函数时接口
 * >lambda表达式的本质：作为函数式接口的实例
 *
 * 何时使用lambda表达式
 * 当需要对一个函数式接口实例化的时候，可以使用lambda表达式
 *
 * 总结：
 *  ->左边：lambda形参列表的参数类型可以省略（类型推断）：如果lambda形参列表只有一个参数，其一对（）也可以省略
 *  ->右边：lambda体应该使用一对{}包裹：如果lambda体只有一条执行语句（可能是return语句），可以省略一对{}和return关键字
 *
 */
public class LambdaTest {


    @org.junit.Test
            public void Test1(){
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();

        System.out.println("*******************");

        Runnable r2 = () ->{
            System.out.println("我爱北京故宫");
        };
//        r2.run();
    }


    @Test
    public void test2() {

   /*     Comparator<Integer> comparator = new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };*/
//        int compare = comparator.compare(12, 21);
//        System.out.println(compare);


        System.out.println("***********");

        Comparator<Integer> com2 = (o3, o4) -> Integer.compare(o3, o4);
        System.out.println(com2.compare(12, 21));

        //方法引用
        Comparator<Integer> com3 = Integer :: compare;
        int compare = com3.compare(32, 21);
        System.out.println(compare);



    }
    @Test
    public void test3(){
//        Human human = new Human() {
//            @Override
//            public void eat() {
//            }
//            public void sleep() {
//            }
//        };



        Human h = ()->{
            System.out.println("吃");
    };

        h.eat();
    }

    @Test
    public void test4(){
        ArrayList list = new ArrayList();
//        list.remove("AA");
        list.add(123);
        list.add(456);
        list.add("AA");

        list.forEach(System.out :: println);


    }


        public static void main(String[] args) {
            // 消费型接口 Consumer<T>
            testConsumer(150D,d-> System.out.println("今天出去消费类了 " + d +"$"));
            testConsumer(d-> System.out.println("今天出去消费类了 " + d +"$"));
            // 函数型接口 Function<T,R>
            System.out.println(testFunction(88, nu -> nu.intValue()));   // <<
            System.out.println("!!!!!!!!!!!!!!!");
            System.out.println(testFunction(nu -> nu << 5));   // <<
            //段言型接口 Predicate<T>
//            System.out.println(testPredicate(List.of("dwadaw", "dsa", "dgw", "w", "rafgd", "s"), str -> str.length() > 3));
            //供给型接口 Supplier<T>
//            System.out.println(testPredicate(2,i->i.equals(1)));
            System.out.println(testSupplier(5, () -> (int) (Math.random()* (50 - 10) + 10)));


        }

        //消费型
        // 消费型接口 Consumer<T>
        //            void accept(T t)  有一个参数没有返回值
        public static void testConsumer(Double d1, Consumer<Double> dd){
            dd.accept(d1);
        }

    public static void testConsumer(Consumer<Double> dd){
        dd.accept(1.0d);
    }

    public static void testConsumer1(Consumer<Double> dd){
    }

        // 函数型接口 Function<T,R>
        //            R apply(T t)    有一个参数一个返回值
        public static int testFunction(int num, Function<Integer,Integer> fct){
            return fct.apply(num);
        }

        public static int testFunction(Function<Integer,Integer> fct){
            return fct.apply(1);
        }

        // 段言型接口 Predicate<T>
        //boolean test(T t)   一个参数一个boolean返回值
        public static List<String> testPredicate(List<String> str, Predicate<String> prd){
            List<String> li = new ArrayList<>();
            for (String s:str){
                if(prd.test(s)){
                    li.add(s);
                }
            }
            return li;
        }

        //    System.out.println(testPredicate(2,i->i.equals(1)));
    public static Boolean testPredicate(Integer j, Predicate<Integer> prd){

        boolean test = prd.test(j);
        return  test;
    }


        // 供给型接口 Supplier<T>
        //            T get()             没有参数一个返回值
        public static List testSupplier(int num , Supplier<Integer> supplier){
            List<Integer> list = new ArrayList<>();
            for (int i = 1;i<=num;i++){
                list.add(supplier.get());
            }
            return list;
        }

}

