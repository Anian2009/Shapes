package com.example.shapes;

public class Square implements Figure{
    private double side;
    private Color color;

    public Square(){
        side = (double) Math.round(Math.random()*1000)/100;
        color = setColor();
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public Color getColor() {
        return color;
    }


    private double getSide(){
        return side;
    }

    public String toString(){
        return draw()+", side "+getSide()+" unit of length";
    }
}
