package com.xiaoma.observer;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName Subject.java
 * @Description 主题接口
 * @createTime 2020年05月18日 20:59:00
 */
//主题接口
public interface Subject {

    //注册观察者
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    //通知所有的观察者
    public void notifyObserver();
}
