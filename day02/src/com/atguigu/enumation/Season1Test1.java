package com.atguigu.enumation;

/**
 *@ClassName Season1
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/3 16:58
 *@Version 1.0
 */
public class Season1Test1 {

    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);

        //values();
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
            values[i].show();
        }
        //valueOf(String objName);返回你要找的对象，如果没有你要找的对象，则抛异常
        Season1 winter =  Season1.valueOf("WINTER");
        System.out.println(winter);

    }
}
interface info{
    void show();
}
enum Season1 implements info{



    //3.提供当前枚举类的对象，多个对象之间用","隔开
    SPRING("春天", "春暖花开"){
        public void show(){
            System.out.println("春天你好");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        public void show(){
            System.out.println("夏天你好");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        public void show(){
            System.out.println("秋天你好");
        }
    },
    WINTER("冬天", "冰天雪地"){
        public void show(){
            System.out.println("冬天你好");
        }

    };

    //声明Season对象属性:private final 修饰
    private final String season1Name;
    private final String season1Desc;

    //1.私有化类的构造器,并给我们对象属性赋值
    private Season1(String season1Name, String season1Desc) {
        System.out.println("你好");
        this.season1Name = season1Name;
        this.season1Desc = season1Desc;
    }




    //4.其他诉求：获取枚举类对象的属性


    public String getSeason1Name() {
        return season1Name;
    }

    public String getSeanson1Desc() {
        return season1Desc;
    }
    //提供toString()方法


    @Override
    public String toString() {
        return "Season{" +
                "season1Name='" + season1Name + '\'' +
                ", season1Desc='" + season1Desc + '\'' +
                '}';
    }
}