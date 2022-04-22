package com.atguigu.Proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *@ClassName DynamicProxy
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/21 17:16
 *@Version 1.0
 */
//测试类
public class DynamicProxy{

    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //给目标创建对象
        ProxyFactory01 proxyFactory01 = new ProxyFactory01(target);
        //创建代理对象
        IUserDao proxy = (IUserDao)proxyFactory01.getProxyInstance();
        //内存中动态生成的动态代理对象
        System.out.println(proxy.getClass());
        System.out.println("=====1=====");
        proxy.save();
        System.out.println("=====2=====");
        proxy.delete();


    }
}

interface IUserDao{

    void save();

    void delete();

    void saveAndDelete();
}

/**
 * 实现类
 * 目标对象
 */
class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void saveAndDelete() {
        save();

        delete();
    }
}

class UserDao1 implements IUserDao{

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void saveAndDelete() {

    }
}

/**
 * 代理工厂类：ProxyFactory
 *
 * 创建动态代理对象
 * 动态代理不需要实现接口，但是需要指定接口类型
 */
 class ProxyFactory01{
     //维护一个目标对象
    private Object target;

    public ProxyFactory01(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事物2");
                        //运用反射执行目标对象方法
                        Object returnValue = method.invoke(target);
                        System.out.println("提交事物2");
                        return returnValue;
                    }
                }

        );
    }
}



