package com.company.structural.facade.model;

public class DvdPlayer {

    public void start(String movie){
        System.out.println(movie + " is started to play");
    }

    public void stop(){
        System.out.println("DVD Player is stopped");
    }
}
