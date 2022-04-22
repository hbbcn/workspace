package com.atguigu.JVM;


/**
 * @ClassName Car
 * @Description TODO
 * @Author hqb
 * @Date 2022/3/2 22:47
 * @Version 1.0
 */
public class Car {

    public int age;

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        Class<Car> carClass = Car.class;
        Class<? extends Car> aClass = car.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(carClass);
        System.out.println(aClass);
        System.out.println(classLoader);//AppClassLoader
        System.out.println(classLoader.getParent());//PlatformClassLoader ExtClassLoader rt.jar
        System.out.println(classLoader.getParent().getParent());//null
    }
}

