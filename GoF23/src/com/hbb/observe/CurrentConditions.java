package com.hbb.observe;
/**
 *@ClassName CurrentConditions
 *@Description  显示当前天气情况（可以理解成气象站自己的网站）
 *@Author hqb
 *@Date 2022/4/4 20:26
 *@Version 1.0
 */
public class CurrentConditions{

    //温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，是由WeatherData来调用，使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display(){
        System.out.println("******Today  mTemperaure: " + temperature + "***");
        System.out.println("******Today  mPressure: " + pressure + "***");
        System.out.println("******Today  mHumidity: " + humidity + "***");

    }
}

