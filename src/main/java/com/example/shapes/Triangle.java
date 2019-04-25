package com.example.shapes;

public class Triangle implements Figure{
    private double side;
    private double height;
    private Color color;

    public Triangle(){
        side = (double) Math.round(Math.random()*1000)/100;
        height = (double) Math.round(Math.random()*1000)/100;
        color = Color.getColor();
    }

    @Override
    public double getArea() {
        return 0.5*side*height;
    }

    @Override
    public Color getColor() {
        return color;
    }

    private double getHeight() {
        return height;
    }

    public String toString(){
        return draw()+", height "+getHeight()+" unit of length";
    }
}
