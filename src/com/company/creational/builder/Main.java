package com.company.creational.builder;

public class Main {

    public static void main(String[] args) {
        Person mustafa = new Person.Builder().name("Mustafa").address("Fatih/İstanbul").age(29).build();
        System.out.println(mustafa.getName() + " - " + mustafa.getAge() + " - " + mustafa.getAddress());
    }
}
