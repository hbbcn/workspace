package com.hbb.observe;
/**
 *@ClassName WeatherData
 *@Description  类核心类
 * 1.包含最新天气情况
 * 2.含有CurrentConditions对象
 * 3.当数据更新时，就主动的调用，CurrentConditions对象update方法
 * （含display）,这样他们（接入方）就看到最新的信息
 *@Author hqb
 *@Date 2022/4/4 21:17
 *@Version 1.0
 */

/**
 * 普通方案
 * 问题分析
 * 其他第三方接入气象站获取数据的问题
 * 无法在运行时动态的添加第三方
 */
public class WeatherData{
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
    // 当增加一个第三方，都需要维护一个对应的第三方的公告板对象，并加入到dataChange
    //不利于维护，也不是动态加入
    public void dataChange(){
        currentConditions.update(this.temperature,getPressure(),getHumidity());
    }

    //
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}

