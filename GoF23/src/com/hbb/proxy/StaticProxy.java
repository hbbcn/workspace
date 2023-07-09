package com.hbb.proxy;

/**
 *@ClassName StaticProxy
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/21 13:43
 *@Version 1.0
 *  静态代理的实现
 */
public class StaticProxy{
    public static void main(String[] args) {
        Person target = new Person();
        PersonProxy personProxy = new PersonProxy(target);
        personProxy.save();
        Class<? extends PersonProxy> aClass = personProxy.getClass();
        Class<? extends Class> aClass1 = aClass.getClass();
        ClassLoader classLoader = personProxy.getClass().getClassLoader();
        System.out.println(aClass);

        System.out.println(aClass1);
        System.out.println(classLoader);
    }
}

/**
 * 定义一个接口
 */
interface PersonInterFace{
   void save();
}

/**
 * 接口对象
 * 目标实现
 */
class Person implements PersonInterFace{
    @Override
    public void save(){
        System.out.println("保存了一些数据");
    }
}

/**
 * 代理对象，静态代理
 * 代理对象也需要实现接口
 */
class PersonProxy implements PersonInterFace{
    //接收保存目标对象
   private PersonInterFace target;

    public PersonProxy(PersonInterFace target) {
        this.target = target;
    }
    /**
     * 对方法的增强
     */
    @Override
    public void save(){
        System.out.println("方法调用之前");
        target.save();
        System.out.println("方法调用之后");
    }
}
