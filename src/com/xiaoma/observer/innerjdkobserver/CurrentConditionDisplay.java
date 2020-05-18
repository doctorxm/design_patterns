package com.xiaoma.observer.innerjdkobserver;

import com.xiaoma.observer.DisplayElement;
import com.xiaoma.observer.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName CurrentConditionDisplay.java
 * @Description 观察者实现(内置jdk版本)
 * @createTime 2020年05月18日 21:58:00
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData) obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();

        }
    }
    //展示最近的温度和湿度
    @Override
    public void display() {
        System.out.println("CurrentConditions:"+temperature+"F degrees and"+humidity+"%humidity");
    }
}
