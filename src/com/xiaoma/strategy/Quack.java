package com.xiaoma.strategy;

/**
 * @Author 厉害的小马fighting!
 * @Date 2019/12/11
 * @Description: com.xiaoma.strategy
 */
public class Quack implements QuackBehavior {
    //嘎嘎叫的声音
    @Override
    public void quack() {
        System.out.println("嘎嘎叫！");
    }
}
