/**
 * @Title:AbstractTest.java
 * @Package:com.atguigu.abtract
 * @Description:TODO(一句话描述该文件做了什么)
 * @author:30988
 * @time:2021年5月13日上午11:06:59
 */
package com.atguigu.abtract;

/*
 * abstract关键字的使用
 * 1.abstract:抽象的
 *
 * 2.abstract可以用来修饰的结构：类，方法；
 *
 * 3.abstract修饰类，抽象类
 * 			此类不能实例化
 * 			抽象类中一定有构造器，便于子类实例化时调用
 * 			开发中，都会提供抽象类的子类，让子类实例化，完成相关操作
 * 4.abstract修饰方法，抽象方法
 * 		抽象方法只有方法的声明，没有方法体
 * 		包含抽象方法的类。一定是个抽象类，反之，抽象类可以没有抽象方法的
 * 		若子类重写了父类中所有的抽象方法后，此子类方可实例化
 *
 *
 *
 */
public class AbstractTest {
    public static void main(String[] args) {

//		method(new Student());//匿名对象
//		Worker p1 = new Worker();
//		method1(p1);//非匿名类非匿名对象
//		method1(new Worker());//非匿名类的匿名对象
//		//创建一个匿名子类的对象
		Person p = new Person(){
                        @Override
                        public void eat() {
                        }//
	};


		//创建匿名子类的匿名对象
//		method1(new Person(){
//			@Override
//			public void eat() {
//				// TODO Auto-generated method stub
//			}
//		});

//	}
//	public static void method1(Person p) {
//		p.walk();
//	}
//	
//	public static void method(Student s) {
//		
//	}

//		Person p = new Student();
//		method(p);

//		method(new Student());
        method(new Person() {

            @Override
            public void eat() {
                // TODO Auto-generated method stub

            }

        });
    }


    public static void method(Person p) {
        System.out.println(p.age);

    }
}


 abstract class Person {

    String name;
    int age = 1;

    Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("你好");
    }
}

class Student extends Person {
    @Override
    public void eat() {
        System.out.println("子类");

    }

    public void sleep(){

    }



}

class Worker extends Person {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("nihao");
    }

    public void walk() {
        System.out.println("你好");
    }


}

abstract class Exer extends Exer2 {
    public void test() {

    }
}

class Exer2 {

}


