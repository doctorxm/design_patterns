package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName Beverage.java
 * @Description 饮料类
 * @createTime 2020年05月23日 21:30:00
 */
public abstract class Beverage {
    String description="Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract  double cost();
}
