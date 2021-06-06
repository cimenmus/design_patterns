package com.company.structural.facade;

public class Main {

    public static void main(String[] args) {
        HomeCinemaSystemFacade homeCinemaSystemFacade = new HomeCinemaSystemFacade();
        homeCinemaSystemFacade.watchMovie("Matrix");
        homeCinemaSystemFacade.endMovie();
    }
}
