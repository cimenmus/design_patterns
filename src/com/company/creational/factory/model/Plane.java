package com.company.creational.factory.model;

public class Plane implements Vehicle {

    @Override
    public void writeInfo() {
        System.out.println("This is a plane. Goes on the air.");
    }
}
