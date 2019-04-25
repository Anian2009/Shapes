package com.example.shapes;

public class Circle implements Figure{
    private double radius;
    private Color color;

    public Circle(){
        radius = (double) Math.round(Math.random()*1000)/100;
        color = setColor();
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public Color getColor() {
        return color;
    }

    private double getRadius() {
        return radius;
    }

    public String toString(){
        return draw()+", radius "+getRadius()+" unit of length";
    }
}
