package com.company.creational.factory;

public class Car implements Vehicle {

    @Override
    public void writeInfo() {
        System.out.println("This is a car. Goes on the road");
    }
}
