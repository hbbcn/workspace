package com.WrapperPrimaryTransform;
/**
 *@ClassName DoubleTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/15 22:52
 *@Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        double a = 12.5;
        //将double类型转换为String类型
        String s = Double.toString(a);
        System.out.println(s);
        //将String类型转换为Double 方法1
        Double aDouble = new Double(s);
        Float aFloat = new Float(32.1f); //基本数据类型=》包装类
        Float aFloat1 = new Float("32.1f"); //字符串=》包装类
        //调用包装类对象的toString方法转换为String类型
        String s2 = aDouble.toString(); //方法1
        String s3 = Double.toString(aDouble); //方法2

        //将包装类—》基本数据类型
        double v = aDouble.doubleValue();

        System.out.println(v);
        //将String转换为double方法2
        double v1 = Double.parseDouble(s);
        String s1 = Integer.toString(1);

        //定义float类型变量，赋值为88.99
        float f1 = 88.99f;
        //将基本类型转换为字符串
        String str1 = Float.toString(f1);
        //打印输出
        System.out.println("f1转换为String类型后与整数20的求和结果为：" + (str1 + 20));
        //定义String类型变量，赋值为"188.55"
        String str2 = "188.55";
        // 将字符串转换为基本类型double
        double b = Double.valueOf(str2);
        System.out.println("str转换为double类型后与整数20的求和结果为：" + (b + 20));

        Integer integer = new Integer(1);
        Integer integer2 = new Integer("123");
        int i = integer.intValue();
        Integer integer1 = Integer.valueOf(1);
        int i1 = Integer.parseInt("11");
        int integer3 = new Integer("123");
        boolean aTrue = new Boolean("true");

    }
}

