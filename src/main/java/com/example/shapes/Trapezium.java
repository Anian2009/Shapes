package com.example.shapes;

public class Trapezium implements Figure{
    private double middleLine;
    private double height;
    private Color color;


    public Trapezium(){
        middleLine = (double) Math.round(Math.random()*1000)/100;
        height = (double) Math.round(Math.random()*1000)/100;
        color = setColor();
    }

    @Override
    public double getArea() {
        return middleLine*height;
    }

    @Override
    public Color getColor() {
        return color;
    }

    private double getMiddleLine(){
        return middleLine;
    }

    public String toString(){
        return draw()+", middle line "+getMiddleLine()+" unit of length";
    }
}
