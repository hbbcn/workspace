package com.hbb.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *@ClassName DynamicProxy
 *@Description 静态代理中，一个代理类只能为一个接口服务，那么如果现在有很多个接口的话，则肯定要写很多的代理类了，
 * 而且，所有的代理操作除了调用的方法不一样之外，其他的操作都一样，此时，肯定有很多重复的代码。
 * 解决这一问题最好的做法是可以通过一个代理类完成全部的代理功能或者说去动态的生成这个代理类，
 * 那么此时就必须使用动态代理完成。
 * 动态代理实现所需要的API：
 * Java动态代理类位于java.lang.reflect包下，主要有以下一个接口和一个类：
 * 1.  InvocationHandler接口：    该接口中仅有一个方法
 * public object invoke(Object proxy, Method method, Object[] args)
 * 在实际使用时，proxy一般是指代理类，method是被代理的方法，args为该方法的参数数组。这个抽象的invoke方法在代理类中动态实现。
 * 2.  Proxy类：  该类即为动态代理类，这里只介绍一下newProxyInstance()这个方法
 * static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
 * ClassLoader loader： 类加载器
 * Class<?>[] interfaces： 得到全部的接口
 * InvocationHandler h: 得到InvocationHandler接口的子类实例
 * 这个方法是最主要的方法，它会返回代理类的一个实例，返回后的代理类可以当做被代理类使用。
 * 如果你要想得到一个加载器的对象，则肯定使用Class类完成。
 * 实现动态代理需4步骤：
 * 1）创建一个实现接口InvocationHandler的类，它必须实现invoke方法。
 * 2）  通过Proxy的静态方法newProxyInstance创建一个代理
 * 3）  创建被代理的类以及接口
 * 4）  通过代理调用方法

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
        //内存中动态生成动态代理对象
        System.out.println(proxy.getClass());
        System.out.println(proxy.getClass().getClassLoader());
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



