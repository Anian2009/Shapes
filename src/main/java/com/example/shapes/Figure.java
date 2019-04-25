package com.example.shapes;

public interface Figure {

   enum Color{WHITE, YELLOW, ORANGE, PINK, RED, BROWN, GREEN, BLUE, PURPLE, BLACK;
       public static Color getColor(){
           return values()[(int) (Math.random()*values().length)];
       }
   }

   default String draw() {
       return "Figure: "+this.getClass().getSimpleName()+", "+(double) Math.round(getArea()*100)/100+" sq unit, color - "+getColor();
   }

   double getArea();

   Color getColor();

}
