package com.xiaoma.observer.innerjdkobserver;
/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName WeatherStation.java
 * @Description 气象站 测试(内置jdk)
 * @createTime 2020年05月18日 22:07:00
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay conditionDisplay=new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(89,68,30.9f);
    }
}
