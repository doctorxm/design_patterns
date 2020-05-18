package com.xiaoma.observer;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName CurrentConditionDisplay.java
 * @Description 观察者实现
 * @createTime 2020年05月18日 21:58:00
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
    //展示最近的温度和湿度
    @Override
    public void display() {
        System.out.println("CurrentConditions:"+temperature+"F degrees and"+humidity+"%humidity");
    }
}
