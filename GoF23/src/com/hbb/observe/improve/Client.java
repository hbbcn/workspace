package com.hbb.observe.improve;

import javax.swing.plaf.ColorUIResource;

/**
 *@ClassName Client
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 0:21
 *@Version 1.0
 */
public class Client{

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        weatherData.setData(10,20,30);
    }
}

