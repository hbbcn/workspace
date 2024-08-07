package com.atguigu.java8;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.atguigu.java8
 * @Author: huang.qingbin
 * @CreateTime: 2023/1/7 12:01
 * @Description: TODO
 * @Version: 1.0
 */

import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

/**
 * 方法引用的使用
 * <p>
 * 1.使用情境：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 * <p>
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。所以
 * 方法引用，也是函数式接口的实例。
 * <p>
 * 3. 使用格式：  类(或对象) :: 方法名
 * <p>
 * 4. 具体分为如下的三种情况：
 * 情况1     对象 :: 非静态方法
 * 情况2     类 :: 静态方法
 * <p>
 * 情况3     类 :: 非静态方法
 * <p>
 * 5. 方法引用使用的要求：要求接口中的抽象方法的形参列表和返回值类型与方法引用的方法的
 * 形参列表和返回值类型相同！（针对于情况1和情况2）
 */
public class MethodRefTest {

    // 情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test() {
        Consumer<String> c1 = str -> System.out.println(str);
        c1.accept("兖州");

        System.out.println("+++++++++++++");
        PrintStream ps = System.out;
        Consumer<String> c2 = ps::println;
        c2.accept("xian");
    }

    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2() {
        Employee emp = new Employee(004, "Nice", 19, 4200);

        String s = "rewr";
        Supplier<String> sk1 = () -> emp.getName();
        System.out.println(sk1.get());

        Supplier<String> sk3 = () -> s;
        System.out.println(sk3.get());

        System.out.println("*******************");
        Supplier<String> sk2 = emp::getName;
        System.out.println(sk2.get());

    }


    // 情况二：类 :: 静态方法
    //Comparator中的int compare(T t1,T t2)
    //Integer中的int compare(T t1,T t2)
    @Test
    public void test3() {
        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(com1.compare(21, 20));

        System.out.println("+++++++++++++++");

        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(15, 7));
    }

    //Function中的R apply(T t)
    //Math中的Long round(Double d)
    @Test
    public void test4() {
        Function<Double, Long> func = new Function<Double, Long>() {
            @Override
            public Long apply(Double d) {
                return Math.round(d);
            }
        };

        System.out.println("++++++++++++++++++");

        Function<Double, Long> func1 = d -> Math.round(d);
        System.out.println(func1.apply(14.1));

        System.out.println("++++++++++++++++++");

        Function<Double, Long> func2 = Math::round;
        System.out.println(func2.apply(17.4));
    }

    // 情况三：类 :: 实例方法  (有难度)
    // Comparator中的int comapre(T t1,T t2)
    // String中的int t1.compareTo(t2)
    @Test
    public void test5() {
        Comparator<String> com1 = (s1, s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("abc", "abd"));

        System.out.println("++++++++++++++++");

        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abd", "abm"));
    }

    //BiPredicate中的boolean test(T t1, T t2);
    //String中的boolean t1.equals(t2)
    @Test
    public void test6() {
        BiPredicate<String, String> pre1 = (s1, s2) -> s1.equals(s2);
        System.out.println(pre1.test("MON", "MON"));

        System.out.println("++++++++++++++++++++");

        BiPredicate<String, String> pre2 = String::equals;
        System.out.println(pre2.test("MON", "MON"));
    }

    // Function中的R apply(T t)
    // Employee中的String getName();
    @Test
    public void test7() {
        Employee employee = new Employee(007, "Ton", 21, 8000);

        Function<Employee, String> func1 = e -> e.getName();
        System.out.println(func1.apply(employee));

        System.out.println("++++++++++++++++++++++++");

        Function<Employee, String> f2 = Employee::getName;
        System.out.println(f2.apply(employee));
    }


    /**
     * 一、构造器引用
     *      和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致。
     *      抽象方法的返回值类型即为构造器所属的类的类型
     *
     * 二、数组引用
     *     可以把数组看做是一个特殊的类，则写法与构造器引用一致。
     */
        //构造器引用
        //Supplier中的T get()
        //Employee的空参构造器：Employee()
        @Test
        public void test8() {
            Supplier<Employee> sup = new Supplier<Employee>() {
                @Override
                public Employee get() {
                    return new Employee();
                }
            };
            System.out.println("+++++++++++++++++++");

            Supplier<Employee> sk1 = () -> new Employee();
            System.out.println(sk1.get());

            System.out.println("+++++++++++++++++++");

            Supplier<Employee> sk2 = Employee::new;
            System.out.println(sk2.get());
        }

        //Function中的R apply(T t)
        @Test
        public void test9() {
            Function<Integer, Employee> f1 = id -> new Employee(id);
            Employee employee = f1.apply(7793);
            System.out.println(employee);

            System.out.println("+++++++++++++++++++");

            Function<Integer, Employee> f2 = Employee::new;
            Employee employee1 = f2.apply(4545);
            System.out.println(employee1);
        }

        //BiFunction中的R apply(T t,U u)
        @Test
        public void test10() {
            BiFunction<Integer, String, Employee> f1 = (id, name) -> new Employee(id, name);
            System.out.println(f1.apply(2513, "Fruk"));

            System.out.println("*******************");

            BiFunction<Integer, String, Employee> f2 = Employee::new;
            System.out.println(f2.apply(9526, "Bon"));
        }

        //数组引用
        //Function中的R apply(T t)
        @Test
        public void test11() {
            Function<Integer, String[]> f1 = length -> new String[length];
            String[] arr1 = f1.apply(7);
            System.out.println(Arrays.toString(arr1));

            System.out.println("+++++++++++++++++++");

            Function<Integer, String[]> f2 = String[]::new;
            String[] arr2 = f2.apply(9);
            System.out.println(Arrays.toString(arr2));
        }

}
