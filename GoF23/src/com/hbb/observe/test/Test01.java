package com.hbb.observe.test;

import java.awt.*;

/**
 *@ClassName Test01
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/25 18:10
 *@Version 1.0
 */
public class Test01{
//普通方式的观察者
   public static void main(String[] args) {
       Weather weather = new Weather(new Sina());
       weather.setData(10,20);
       System.out.println("天气情况发生变化");
       weather.setData(30,40);
   }
}


class Sina{
    private float tem;
    private float pre;

    public void update(float tem, float pre){
        this.tem = tem;
        this.pre = pre;
        display();
    }

    public void display(){
        System.out.println("******Today  mTemperaure: " + tem + "***");
        System.out.println("******Today  mPressure: " + pre + "***");
    }

}

class Weather{
    private float tem;
    private float pre;
    Sina sina;

    public Weather(Sina sina) {
        this.sina = sina;
    }
    public void dataChange(){
        sina.update(this.tem,getPre());
    }
    public void setData(float tem,float pre){
        this.tem = tem;
        this.pre = pre;
        dataChange();//通过气象站主动更新天气数据
    }
    public float getTem() {
        return tem;
    }
    public float getPre() {
        return pre;
    }
    public Sina getSina() {
        return sina;
    }
}

