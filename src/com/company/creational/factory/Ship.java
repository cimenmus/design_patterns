package com.company.creational.factory;

public class Ship implements Vehicle {

    @Override
    public void writeInfo() {
        System.out.println("This is a ship. Goes on the sea.");
    }
}
