package com.company.creational.prototype.model;

public class Rectangle extends Shape {

    public Rectangle(){
        type = ShapeType.RECTANGLE;
    }

    @Override
    void draw() {
        System.out.println("Rectangle is drawn");
    }
}
