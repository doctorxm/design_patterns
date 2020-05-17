package com.xiaoma.strategy;

/**
 * @Author 厉害的小马fighting!
 * @Date 2019/12/11
 * @Description: com.xiaoma.
 * 绿头鸭会飞而且嘎嘎叫
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior =new Quack();
        flyBehavior=new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a real Mallard duck!");
    }
}
