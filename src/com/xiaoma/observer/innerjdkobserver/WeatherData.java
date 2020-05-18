package com.xiaoma.observer.innerjdkobserver;

import com.xiaoma.observer.Observer;
import com.xiaoma.observer.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName WeatherData.java
 * @Description 可观察者 jdk 内置观察者模式实现
 * @createTime 2020年05月18日 21:16:00
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){

    }
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
