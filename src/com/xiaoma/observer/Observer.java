package com.xiaoma.observer;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName Observer.java
 * @Description 观察者接口
 * @createTime 2020年05月18日 20:59:00
 */
public interface Observer {

 /**
  * @title update
  * @description
  * @param temperature 温度
  * @param humidity 湿度
  * @param pressure 气压
  * @updateTime 2020/5/18 21:43
  */
    public void update(float temperature,float humidity,float pressure);
}
