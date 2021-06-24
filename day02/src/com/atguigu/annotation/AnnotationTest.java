package com.atguigu.annotation;

import java.util.ArrayList;

/**
 *@ClassName AnnotationTest
 *@Description
 * 注解的使用
 *
 *  1.jdk5新增的
 *  2.Annotation 其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取
 *      并执行相应的处理。通过使用Annotation，程序员可以在不改变原有逻辑的情况下，
 *      在源文件中嵌入一些补充的信息。
 *  3.在JavaSE中，注解的使用目的比较简单，例如标记功能，忽略警告等。在Java中
 *         注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替JavaEE旧版中所遗留的
 *         繁冗代码的XML配置等。
 *
 * Annotation的使用示例
 * 示列一：生成文档相关注解
 * 示列二：在编译时进行格式检查（JDk内置的三个基本注解）
 * @Override: 限定重写父亲的方法，该注解只能用于方法
 * @Deprecated ；用于表示所修饰的元素（类，方法等）已过时。通常是因为所修饰的结构危险或村在更好的选择
 * @SupperssWarnings :抑制编译器警告。
 *
 * 4.如何自定义注解：参照SupperssWarnings定义
 *      1.注解声明为 @interface
 *      2.内部定义成员，通常使用value表示
 *      3.可以指定成员的默认值，使用default定义
 *      4.如果自定义注解没有成员，表明是一个标识的作用
 *
 *
 *      如果注解有成员，在使用注解时，需要指明成员值。
 *
 *      自定义注解必须配上注解的信息处理流程(使用反射）才有意义
 *      自定义注解通常都会指明两个元注解：Retention、Target
 *  5.jdk提供了四种元注解
 *          元注解： 对现有的注解进行解释说明的注解
 *      Retention ：指定所修饰的Annotation 的生命周期 ：SOURCE/CLASS(默认行为)/RUBTIME
 *                  只有声明为RUNTIME生命周期的注解，才能通过反射获取
 *
 *      Target　：用于指定被Annotation 能用于修饰哪些程序元素
 *      ******出现的频率较低******
 *      Doucumented : 表示所修饰的注解在被javadoc解析时，保留下来
 *      Inherited ： 被它修饰的Annotation 将具有继承性
 *
 *
 *   6.通过反射获取注解信息
 *
 * java jdk8之后
 *   7. 可重复注解: ①在MyAnnotaion上声明@Repeatable,成员值为MyAnnotations.class相同。
 *                  ②MyAnnotation的Target和Retention和MyAnnotations相同
 *
 *   8.类型注解
 *   ElementType.TYPE_PARAMETER 表示该注解能写在类型变量的声明语句中（如：泛型声明）
 *   ElementType.TYPE_USE 表示该注解能写在使用类型的任何语句中。
 *
 *
 *
 *
 *
 * @Author HuangQingbin
 * @Date 2021/6/3 18:39
 * @Version 1.0
 */
public class AnnotationTest{

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
    }
}

@MyAnnotation(value = "hello")
@MyAnnotation(value = "hi")
//jdk8之前的写法
//@MyAnnotations({@MyAnnotation(value = "hello"),@MyAnnotation(value = "hi")})
class Person{

}

class Generic<@MyAnnotation T>{

    public void show() throws @MyAnnotation RuntimeException{
        ArrayList<@MyAnnotation String> list = new ArrayList<>();

        int num = (@MyAnnotation int) 10L;

    }
}

