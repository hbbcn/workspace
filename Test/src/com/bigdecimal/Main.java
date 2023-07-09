package com.bigdecimal;

import java.math.BigDecimal;

/**
 *@ClassName main
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/15 17:36
 *@Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Float a = 2.2f;
        Float b = 2.0f;
        Float c = a- b;

        BigDecimal a1 = new BigDecimal(Float.toString(a));
        BigDecimal b1 = new BigDecimal(Float.toString(b));
        float c1 = a1.subtract(b1).floatValue();
        System.out.println("没用BigDecimal的结果---" + c);
        System.out.println("用了BigDecimal的结果---" + c1);

/*
BigDecimal构造方法
    BigDecimal BigDecimal(double d); //不允许使用
    BigDecimal BigDecimal(String s); //常用,推荐使用
    static BigDecimal valueOf(double d); //常用,推荐使用
    double 参数的构造方法,不允许使用!!!!因为它不能精确的得到相应的值;
    String 构造方法是完全可预知的: 写入 new BigDecimal("0.1") 将创建一个 BigDecimal,它正好等于预期的0.1;
    因此,通常建议优先使用 String 构造方法;
    静态方法 valueOf(double val) 内部实现,仍是将 double 类型转为 String 类型;
    这通常是将 double(或float)转化为 BigDecimal 的首选方法;
     测试

*/
        System.out.println(new BigDecimal(0.1));
        System.out.println(new BigDecimal("0.1"));
        System.out.println(BigDecimal.valueOf(0.1));
    }
}

