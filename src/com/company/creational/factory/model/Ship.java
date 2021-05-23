package com.company.creational.factory.model;

public class Ship implements Vehicle {

    @Override
    public void writeInfo() {
        System.out.println("This is a ship. Goes on the sea.");
    }
}
