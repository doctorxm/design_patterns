package com.xiaoma.observer.innerjdkobserver;

import com.xiaoma.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName ForecastDisplay.java
 * @Description
 * @createTime 2020年05月23日 17:05:00
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure=29.92f;
    private float lastPressure;
    public  ForecastDisplay(Observable observable){
         observable.addObserver(this);
        }
    @Override
    public void display() {

    }
    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            WeatherData weatherData=(WeatherData)observable;
            lastPressure=currentPressure;
            currentPressure=weatherData.getPressure();
            display();
        }
    }
}
