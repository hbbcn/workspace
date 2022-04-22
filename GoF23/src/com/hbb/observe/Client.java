package com.hbb.observe;
/**
 *@ClassName Client
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/4 21:28
 *@Version 1.0
 */
public class Client{
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);

        //更新天气情况
        weatherData.setData(30,150,40);

        //天气情况变化
        System.out.println("天气情况发生变化");
        weatherData.setData(40,160,40);

    }
}

