package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName Espresso.java
 * @Description 浓缩咖啡
 * @createTime 2020年05月23日 21:36:00
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
