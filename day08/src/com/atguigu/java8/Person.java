package com.atguigu.java8;
/**
 *@ClassName Person
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/10 18:24
 *@Version 1.0
 */
/**
 *
 静态的方法不能覆写，也不能被重写。总之，静态的没有重写！！！
 静态方法可以被继承，但是接口的静态方法不可以被继承。
 * @param
 */
public class Person implements Human{
    public static void humanTest(Human human){
        human.test02();
    }
    public static void main(String[] args) {

        Human human = new Human() {
            @Override
            public void eat() {
            }
        };

        Person person = new Person();
        person.humanTest(human);
        person.humanTest(new Human() {
            @Override
            public void eat() {
            }
        });

    }

    @Override
    public void eat() {

    }

    public static void test01(){

    }




  /*  public static void test01(){
        System.out.println("111111");
        test02();
    }*/

}

