package com.hbb.observe.improve;
import java.util.ArrayList;
/**
 * @ClassName WeatherData
 * @Description 类核心类
 * 1.包含最新天气情况
 * 2.含有观察者集合
 * 3.当数据更新时，就主动的调用 ArrayList管理
 * 通知所有的（接入方）就看到最新的信息
 * @Author hqb
 * @Date 2022/4/4 21:17
 * @Version 1.0
 */
//观察者模式
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observe> observes;


    public WeatherData() {
        observes = new ArrayList<Observe>();
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

    public void dataChange(){
        notifyObservers();
    }
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observe o) {
        observes.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observe o) {
        if (observes.contains(o)){
            observes.remove(o);
        }

    }

    //遍历所有观察者并通知
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observes.size(); i++) {
            Observe observe = observes.get(i);
            observe.update(this.temperature,this.pressure,this.humidity);
        }
    }
}

