package com.xiaoma.strategy;

/**
 * @Author 厉害的小马fighting!
 * @Date 2019/12/11
 * @Description: com.xiaoma.strategy
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    //不会飞的鸭子的飞行行为的实现
    public void fly() {
        System.out.println("I can't fly!");
    }
}
