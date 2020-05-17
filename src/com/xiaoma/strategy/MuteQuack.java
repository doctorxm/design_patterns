package com.xiaoma.strategy;

/**
 * @Author 厉害的小马fighting!
 * @Date 2019/12/11
 * @Description: com.xiaoma.strategy
 */
public class MuteQuack implements QuackBehavior{
    //不会叫的鸭子的叫声行为实现
    @Override
    public void quack() {
        System.out.println("keep quiet!不会叫");
    }
}
