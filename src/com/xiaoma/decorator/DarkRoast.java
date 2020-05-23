package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName DarkRoast.java
 * @Description
 * @createTime 2020年05月23日 21:55:00
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description="Dark Roast Coffee!";
    }
    @Override
    public double cost() {
        return .18;
    }
}
