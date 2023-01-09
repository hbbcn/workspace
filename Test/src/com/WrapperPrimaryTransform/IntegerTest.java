package com.WrapperPrimaryTransform;
/**
 *@ClassName IntegerTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/15 22:39
 *@Version 1.0
 */
public class IntegerTest{

    public static void main(String[] args) {
        // 定义int类型变量，值为100
        int score = 100;
        // 创建Integer包装类对象，表示变量score1的值
        Integer score1 = new Integer(score);
        // 将Integer包装类转换为double类型
        double d = score1.intValue();
        float d1 = score1.intValue();
        // 将Integer包装类转换为long类型
        long l = score1.intValue();
        // 将Integer包装类转换为int类型
        int i = score1.intValue();
        System.out.println("score对应的Integer类型结果为：" + score1);
        System.out.println("score对应的double类型结果为：" + d);
        System.out.println("score对应的float类型结果为：" + d1);
        System.out.println("score对应的long类型结果为：" + l);
        System.out.println("重新由Integer类型转换为int类型的结果为：" + i);


    }
}

