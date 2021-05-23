package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.model.computer.Computer;
import com.company.creational.abstractfactory.model.computer.ComputerType;
import com.company.creational.abstractfactory.model.phone.Phone;
import com.company.creational.abstractfactory.model.phone.PhoneType;

public class Main {

    public static void main(String[] args) {

        ElectronicFactory phoneFactory = ElectronicFactoryProducer.getFactory(ElectronicFactoryType.PHONE);
        Phone smartPhone = phoneFactory.createPhone(PhoneType.SMART_PHONE);
        smartPhone.makeCall();
        Phone landPhone = phoneFactory.createPhone(PhoneType.LAND_PHONE);
        landPhone.makeCall();

        ElectronicFactory computerFactory = ElectronicFactoryProducer.getFactory(ElectronicFactoryType.COMPUTER);
        Computer laptopComputer = computerFactory.createComputer(ComputerType.LAPTOP);
        laptopComputer.run();
        Computer desktopComputer = computerFactory.createComputer(ComputerType.DESKTOP);
        desktopComputer.run();
    }
}
