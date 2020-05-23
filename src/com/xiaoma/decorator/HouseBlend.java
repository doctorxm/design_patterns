package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName HouseBlend.java
 * @Description
 * @createTime 2020年05月23日 21:40:00
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
