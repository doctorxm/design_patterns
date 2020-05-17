package com.xiaoma.strategy;

/**
 * @Author 厉害的小马fighting!
 * @Date 2019/12/11
 * @Description: com.xiaoma.strategy
 */
public class FlyWithWings implements FlyBehavior{
   //会飞的鸭子的飞行行为实现
    @Override
    public void fly() {
        System.out.println("I am fly!!");
    }
}
