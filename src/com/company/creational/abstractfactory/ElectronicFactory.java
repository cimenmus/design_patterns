package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.computer.Computer;
import com.company.creational.abstractfactory.computer.ComputerType;
import com.company.creational.abstractfactory.phone.Phone;
import com.company.creational.abstractfactory.phone.PhoneType;

public interface ElectronicFactory {

    Computer createComputer(ComputerType type);
    Phone createPhone(PhoneType type);
}
