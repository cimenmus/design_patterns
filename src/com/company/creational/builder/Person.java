package com.company.creational.builder;

/**
 * BuilderPattern
 * https://tugrulbayrak.medium.com/builder-pattern-2f6fb1dbf4a0
 *
 * Nesne tabanlı programlamanın özü sınıflara dayanır. Sınıflardan nesneler yaratırız.
 * Bunu yapmak için de constructorları kullanırız.
 * Sınıfımızda bulunan field sayısı fazla olursa bundan dolayı birden çok constructora ihtiyaç duyabiliriz.
 * Haliyle her bir field eklendiğinde yeni bir constructor ekleme ihtiyacı hissedebiliriz.
 * Çünkü nesneyi oluştururken hangi field başta atama yapılacak ya da yapılmayacak bilemeyebiliriz.
 * İşte bu uzayıp giden parametre sayısından, karmaşık constructorlardan kurtarmak için Builder Pattern güzel bir çözüm sunuyor.
 */
public class Person {

    private String name;
    private String address;
    private int age;

    private Person(){}

    private Person(Builder builder){
        name = builder.name;
        address = builder.address;
        age = builder.age;
    }

    public static class Builder{

        private String name;
        private String address;
        private int age;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
