package com.hbb.strategy;
/**
 *@ClassName Client
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 14:50
 *@Version 1.0
 */
public class Client{

    /**
     * 传统方式解决鸭子问题分析和解决方案
     * 1）其他鸭子，都继承Duck类，所以fly让所有子类都会飞
     * 这是不正确的
     * 2）上面说的1的问题，其实是继承带来的问题：对类局部改动，尤其
     * 是超类的改动，会影响其他部分。会有溢出效应
     * 3）为了改进1问题，我们可以通过覆盖fly方法来解决 =>覆盖解决
     * 4)问题又来了，如果我们有一个ToyDuck,这样就需要去覆盖Duck类的
     * 所有实现方法 => 解决思路 策略模式
     */
}

