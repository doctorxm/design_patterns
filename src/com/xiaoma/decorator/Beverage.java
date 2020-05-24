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
    String size;
    String TALL;
    String GRANDE;
    String VENTI;
    public String getDescription(){
        return description;
    }
    public String getSize(){
        return  size;
    }
    public void setSize(String size){
        this.size=size;
    }
    public abstract  double cost();
}
