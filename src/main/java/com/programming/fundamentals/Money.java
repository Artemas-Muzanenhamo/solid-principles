package com.programming.fundamentals;

public class Money {

    private double value;

    public Money(double value){
        this.value = value;
    }

    /**
     * The Getters and Setters expose the implementations
     * of our object by showing that our value is a double.
     */

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }

}
