package com.example;

import com.example.shapes.*;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();

        for (int i = 0; i < (int) (Math.random() * 10); i++)
            list.add(new Square());
        for (int i = 0; i < (int) (Math.random() * 10); i++)
            list.add(new Circle());
        for (int i = 0; i < (int) (Math.random() * 10); i++)
            list.add(new Trapezium());
        for (int i = 0; i < (int) (Math.random() * 10); i++)
            list.add(new Triangle());

        for (Figure item:list) {System.out.println(item);}

    }
}
