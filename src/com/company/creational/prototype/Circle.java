package com.company.creational.prototype;

public class Circle extends Shape {

    public Circle(){
        type = ShapeType.CIRCLE;
    }

    @Override
    void draw() {
        System.out.println("Circled is drawn");
    }
}
