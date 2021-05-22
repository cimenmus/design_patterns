package com.company;

import com.company.creational.abstractfactory.ElectronicFactory;
import com.company.creational.abstractfactory.FactoryProducer;
import com.company.creational.abstractfactory.FactoryType;
import com.company.creational.abstractfactory.computer.Computer;
import com.company.creational.abstractfactory.computer.ComputerType;
import com.company.creational.abstractfactory.phone.Phone;
import com.company.creational.abstractfactory.phone.PhoneType;
import com.company.creational.prototype.Shape;
import com.company.creational.prototype.ShapeCache;
import com.company.creational.singleton.ImageLoader;
import com.company.creational.builder.Person;
import com.company.creational.factory.*;

/**
 * Abstract Factory Pattern
 * https://yasinmemic.medium.com/abstract-factory-design-pattern-d142de6a883c
 *
 * Factory tasarım deseni, benzer özellikleri olan alt sınıflara ortak bir arayüz uygular ve
 * nesne yaratma sorumluluğunu, bu arayüz üzerinden gerçekleştiren bir factory sınıfına verir.
 * Client tarafı alt nesne oluşturmak istediğinde factory sınıfına talepte bulunur ve nesne factory sınıfı tarafından yaratılır.
 *
 * Factory tasarım kalıbını örneklersek, Mercedes-Audi-BMW araçlarımız olsun,
 * bu araçlar Otomobil interface’ ine bağlı olup,
 * oluşturulmak istendiğinde Otomobil interface’i üzerinden bir factory sınıfı aracılığıyla oluşturuluyor. Mantık özetle bu.
 *
 * Abstract factory tasarım şablonu, factory tasarım kalıbında olan mantığı, bir değil de birden çok factory sınıfıyla yapmayı amaçlıyor.
 * Bunu yaparken, factory sınıflarını da ortak bir arayüz üzerinden yönetiyor.
 */
public class Main {

    public static void main(String[] args) {

        // ------------------------------ Singleton Pattern ------------------------------------------------------
        ImageLoader.getInstance().writeInfo();

        // ------------------------------ Builder Pattern ------------------------------------------------------
        Person mustafa = new Person.Builder().name("Mustafa").address("Fatih/İstanbul").age(29).build();
        System.out.println(mustafa.getName() + " - " + mustafa.getAge() + " - " + mustafa.getAddress());

        // ------------------------------ Factory Pattern ------------------------------------------------------
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle(VehicleType.CAR);
        car.writeInfo();

        Vehicle plane = vehicleFactory.createVehicle(VehicleType.PLANE);
        plane.writeInfo();

        Vehicle ship = vehicleFactory.createVehicle(VehicleType.SHIP);
        ship.writeInfo();

        // ------------------------------ Abstract Factory Pattern ------------------------------------------------------
        ElectronicFactory phoneFactory = FactoryProducer.getFactory(FactoryType.PHONE);

        Phone smartPhone = phoneFactory.createPhone(PhoneType.SMART_PHONE);
        smartPhone.makeCall();

        Phone landPhone = phoneFactory.createPhone(PhoneType.LAND_PHONE);
        landPhone.makeCall();

        ElectronicFactory computerFactory = FactoryProducer.getFactory(FactoryType.COMPUTER);

        Computer laptopComputer = computerFactory.createComputer(ComputerType.LAPTOP);
        laptopComputer.run();

        Computer desktopComputer = computerFactory.createComputer(ComputerType.DESKTOP);
        desktopComputer.run();

        // ------------------------------ Prototype Pattern ------------------------------------------------------
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.out.println("Shape : " + circle.getType());

        Shape rectangle = ShapeCache.getShape("2");
        System.out.println("Shape : " + rectangle.getType());
    }
}
