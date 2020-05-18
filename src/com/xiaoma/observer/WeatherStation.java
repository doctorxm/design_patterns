package com.xiaoma.observer;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName WeatherStation.java
 * @Description 气象站 测试
 * @createTime 2020年05月18日 22:07:00
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentDisplay=new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
