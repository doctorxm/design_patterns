package com.xiaoma.strategy;

/**
 * @Author 厉害的小马fighting!
 * @Date 2019/12/11
 * @Description: com.xiaoma.strategy
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
