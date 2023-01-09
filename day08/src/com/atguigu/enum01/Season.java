package com.atguigu.enum01;

/**
 * @ClassName Season
 * @Description 使用enum关键字定义枚举类
 * 说明： 定义的枚举类默认继承Java.Lang.Enum类
 * @Author hqb
 * @Date 2022/5/25 23:45
 * @Version 1.0
 */
/*
   1. Enum类中的常用方法：
    values()方法：返回当前枚举类的对象数组。该方法可以很方便地遍历所有的枚举值
    valueOf(String str): 可以把一个字符串转为对应的枚举类对象，要求字符串必须是枚举类对象
    要求字符串是枚举类对象的“名字”。如不是，会有运行时异常；IllegalArgumentException
    toString: 返回当前枚举类对象常量的名称
   2. 使用enum关键字定义的枚举类实现接口的情况
      情况一： 实现接口，在enum类中实现抽象方法
      情况二： 让枚举类的对象分别实现接口中的抽象方法
 */
public class Season {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer.toString());
        System.out.println(Season1.class.getSuperclass());
        System.out.println("*************");
        //values();
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        //valueOf(String objName); 寻找对应的对象名
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
        Season1 summer1 = Season1.valueOf("SUMMER");
        System.out.println(summer1);
        summer1.show();
        System.out.println(Season1.SPRING);
    }

}

interface info {
   void show();
}

enum Season1 implements info{
    //1.提供当前枚举类的对象，多个对象之间用逗号隔开，末尾对象分号结束
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {

        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    };

    //2.声明Season对象的属性，private final修饰
    private final String seasonName;
    private final String SeasonDesc;

    //私有化构造器，并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        SeasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    //每一个类都会调用的都是同一个方法
 /*   @Override
    public void show() {
        System.out.println("这是一个季节");
    }
*/
//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", SeasonDesc='" + SeasonDesc + '\'' +
//                '}';
//    }
}

