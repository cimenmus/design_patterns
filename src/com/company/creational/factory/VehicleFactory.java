package com.company.creational.factory;

/**
 * Factory Pattern
 *
 * Aynı interface'i veya abstract sınıfı implement etmiş etmiş factory nesnelerinin üretiminden sorumlu pattern dir.
 * Yazdığınız program da birbirine benzeyen birden fazla sınıf olabilir.
 * Bu tür sınıfları oluştururken her seferinde new operatörünü kullanmayın ya da
 * o sınıflardan sanki birbirinden bağımsızmış gibi kod yazmayalım diye böyle bir örüntü tasarlamışlar.
 */
public class VehicleFactory {

    public Vehicle createVehicle(VehicleType type){
        Vehicle vehicle = null;
        switch (type){
            case CAR:
                vehicle = new Car();
                break;

            case PLANE:
                vehicle = new Plane();
                break;

            case SHIP:
                vehicle = new Ship();
                break;
        }
        return vehicle;
    }
}
